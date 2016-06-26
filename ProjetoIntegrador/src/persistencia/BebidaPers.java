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
import vo.BebidaVO;

/**
 *
 * @author Giovane
 */
public class BebidaPers {
    final int BEBIDA = 3;
    Conexao conexao;
    public BebidaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <BebidaVO> buscarBebida(BebidaVO bebidaVO) throws SQLException, Exception {
        
        ArrayList <BebidaVO> bebida = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            sql = "SELECT pro_codigo, pro_nome, pro_tipo, pro_volume, pro_preco, pro_status "
                    + "FROM produto "
                    + "WHERE pro_identificador = " + BEBIDA;
               
            if(bebidaVO.getCodigo() != 0)
                sql = sql + " AND pro_codigo = " + bebidaVO.getCodigo();

            if(bebidaVO.getMarca() != null)
                sql = sql + " AND pro_nome LIKE '%" + bebidaVO.getMarca() + "%'";
            
            if(bebidaVO.getStatus() == "Ativo")
                sql = sql + " AND pro_status = 'Ativo'";
            
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {

                BebidaVO bebVO = new BebidaVO();
                
                bebVO.setCodigo(consulta.getInt("pro_codigo"));
                bebVO.setMarca(consulta.getString("pro_nome"));
                bebVO.setTipo(consulta.getString("pro_tipo"));
                bebVO.setVolume(consulta.getDouble("pro_volume"));
                bebVO.setPreco(consulta.getDouble("pro_preco"));
                bebVO.setStatus(consulta.getString("pro_status"));
                
                bebida.add(bebVO);
            }
            
            return bebida;
        } finally {
            conexao.desconectar();   
        }
    }
        
    public void gravarBebida(BebidaVO bebVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            
            if(bebVO.getCodigo() == 0){
                sql = "INSERT INTO produto (pro_identificador, pro_nome, pro_tipo, pro_volume, pro_preco, pro_status) VALUES ("
                        + BEBIDA + ", "
                        + "'" + bebVO.getMarca() + "', "
                        + "'" + bebVO.getTipo() + "', "
                        + bebVO.getVolume() + ", "
                        + bebVO.getPreco() + ", "
                        + "'" + bebVO.getStatus() + "'"
                        + ");";
            }else{
                sql = "UPDATE produto SET "
                        + "pro_nome = '" + bebVO.getMarca() + "', "
                        + "pro_tipo = '" + bebVO.getTipo() + "', "
                        + "pro_volume = " + bebVO.getVolume() + ", "
                        + "pro_preco = " + bebVO.getPreco() + ", "
                        + "pro_status = '" + bebVO.getStatus() + "' "
                        + "WHERE pro_codigo = " + bebVO.getCodigo();
            }
            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
