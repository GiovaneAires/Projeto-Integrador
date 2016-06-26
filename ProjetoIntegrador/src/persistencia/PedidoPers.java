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
import java.util.ArrayList;
import vo.PedidoItemVO;
import vo.PedidoVO;

/**
 *
 * @author Giovane
 */
public class PedidoPers {
    Conexao conexao;
    public PedidoPers(){
        this.conexao = new Conexao();
    }
    
        public ArrayList <PedidoVO> buscarPedido() throws SQLException, Exception {

        ArrayList <PedidoVO> pedido = new ArrayList();
        
        try {

            Connection con;
            Statement stm;
            ResultSet consulta;
            
            con = conexao.conectar();
            stm = con.createStatement();
            consulta = stm.executeQuery("SELECT * FROM pedido;");

            while (consulta.next()) {
                PedidoVO pedVO = new PedidoVO();
                
                pedido.add(pedVO);
            }
        } finally {
            conexao.desconectar();
            return pedido;
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
                    + pedItemVO.getValorUnitario()+ ", "
                    + ");";
            System.out.println(sql);
//            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
