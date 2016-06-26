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
import vo.BordaVO;

/**
 *
 * @author Giovane
 */
public class BordaPers {
    final int BORDA = 2;
    Conexao conexao;
    
    public BordaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <BordaVO> buscarBorda(BordaVO bordaVO) throws SQLException, Exception {

        ArrayList <BordaVO> borda = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            sql = "SELECT pro_codigo, pro_nome, pro_tipo, pro_preco, pro_status "
                    + "FROM produto "
                    + "WHERE pro_identificador = " + BORDA;
                
            if(bordaVO.getCodigo() != 0)
                sql = sql + " AND pro_codigo = " + bordaVO.getCodigo();

            if(bordaVO.getSabor() != null)
                sql = sql + " AND pro_nome LIKE '%" + bordaVO.getSabor() + "%'";
            
            if(bordaVO.getStatus() == "Ativo")
                sql = sql + " AND pro_status = 'Ativo'";
            
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {

                BordaVO borVO = new BordaVO();
                
                borVO.setCodigo(consulta.getInt("pro_codigo"));
                borVO.setSabor(consulta.getString("pro_nome"));
                borVO.setTipo(consulta.getString("pro_tipo"));
                borVO.setPreco(consulta.getDouble("pro_preco"));
                borVO.setStatus(consulta.getString("pro_status"));
                
                borda.add(borVO);
            }
            return borda;
        } finally {
            conexao.desconectar();   
        }
    }
    
    public void gravarBorda(BordaVO borVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
             
            if(borVO.getCodigo() == 0){
                sql = "INSERT INTO produto (pro_identificador, pro_nome, pro_tipo, pro_preco, pro_status) VALUES ("
                        + BORDA + ", "
                        + "'" + borVO.getSabor()+ "', "
                        + "'" + borVO.getTipo() + "', "
                        + borVO.getPreco() + ", "
                        + "'" + borVO.getStatus() + "'"
                        + ");";
            }else{
                sql = "UPDATE produto SET "
                        + "pro_nome = '" + borVO.getSabor()+ "', "
                        + "pro_tipo = '" + borVO.getTipo() + "', "
                        + "pro_preco = " + borVO.getPreco() + ", "
                        + "pro_status = '" + borVO.getStatus() + "' "
                        + "WHERE pro_codigo = " + borVO.getCodigo();
            }
            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
