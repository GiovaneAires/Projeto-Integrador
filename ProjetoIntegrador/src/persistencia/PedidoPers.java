/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import vo.ClienteVO;
import vo.PedidoItemVO;
import vo.PedidoVO;
import vo.RelatorioVO;

/**
 *
 * @author Giovane
 */
public class PedidoPers {
    Conexao conexao;
    public PedidoPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <RelatorioVO> gerarRelatorioCliente(ClienteVO clienteVO) throws SQLException, Exception {

        ArrayList<RelatorioVO> dadosRelotorios = new ArrayList();
        
        try {

            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            sql = "SELECT cli_nome, group_concat(pei_descricao) AS pei_descricao, ped_datahora, ped_valor_total "
                    + " FROM pedido "
                    + " INNER JOIN pedido_item ON ped_codigo = pei_fk_ped_codigo "
                    + " INNER JOIN cliente ON cli_codigo = ped_fk_cli_codigo ";
            
            if(clienteVO.getCodigo() != 0 || clienteVO.getNome() != null){
                sql = sql + "WHERE TRUE ";
                
                if(clienteVO.getCodigo() != 0)
                    sql = sql + " AND cli_codigo = " + clienteVO.getCodigo();
                
                if(clienteVO.getNome() != null)
                    sql = sql + " AND cli_nome LIKE '%" + clienteVO.getNome() + "%'";
            }
            sql = sql + "GROUP BY ped_codigo;";
            
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {
                RelatorioVO relVO = new RelatorioVO();
                
                relVO.setCliente(consulta.getString("cli_nome"));
                relVO.setDescricao(consulta.getString("pei_descricao"));
                relVO.setDataI(consulta.getDate("ped_datahora"));
                relVO.setPreco(consulta.getDouble("ped_valor_total"));
                
                dadosRelotorios.add(relVO);
            }
            return dadosRelotorios;
        } finally {
            conexao.desconectar();
        }
    }
    
    public ArrayList <RelatorioVO> gerarRelatorioPeriodo(RelatorioVO relatorioVO) throws SQLException, Exception {

        ArrayList<RelatorioVO> dadosRelotorios = new ArrayList();
        
        try {

            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
            
            sql = "SELECT cli_nome, group_concat(pei_descricao) AS pei_descricao, ped_datahora, ped_valor_total "
                    + " FROM pedido "
                    + " INNER JOIN pedido_item ON ped_codigo = pei_fk_ped_codigo "
                    + " INNER JOIN cliente ON cli_codigo = ped_fk_cli_codigo "
                    + " WHERE TRUE ";
            
            sql += " AND DATE(ped_datahora) BETWEEN '" + sp.format(relatorioVO.getDataI()) + "' AND '" 
                                                       + sp.format(relatorioVO.getDataF()) + "' ";

            sql += "GROUP BY ped_codigo;";
            System.out.println(sql);
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {
                RelatorioVO relVO = new RelatorioVO();
                
                relVO.setCliente(consulta.getString("cli_nome"));
                relVO.setDescricao(consulta.getString("pei_descricao"));
                relVO.setDataI(consulta.getDate("ped_datahora"));
                relVO.setPreco(consulta.getDouble("ped_valor_total"));
                
                dadosRelotorios.add(relVO);
            }
            return dadosRelotorios;
        } finally {
            conexao.desconectar();
        }
    }
    
    public int gravarPedido(PedidoVO pedVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            
            sql = "INSERT INTO pedido (ped_datahora, ped_fk_cli_codigo, ped_valor_total) VALUES ("
                    + "NOW(), "
                    + pedVO.getCodigoCliente() + ", "
                    + pedVO.getValorTotal()
                    + ");";
            
            stm.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
            
            ResultSet rs = stm.getGeneratedKeys();
            rs.next();
            int id = rs.getInt(1);
            
            return id;
        }finally{
            conexao.desconectar();
        }
    }
    
    public void gravarPedidoItem(PedidoItemVO pedItemVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            System.out.println("chegou");
            
            sql = "INSERT INTO pedido_item (pei_fk_ped_codigo, pei_fk_pro_codigo, pei_descricao, pei_quantidade, pei_valor_unitario) VALUES ("
                    + pedItemVO.getCodigoPedido() + ", "
                    + pedItemVO.getCodigoProduto() + ", "
                    + "'" + pedItemVO.getDescricao()+ "', "
                    + pedItemVO.getQuantidade()+ ", "
                    + pedItemVO.getValorUnitario()
                    + ");";
            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
