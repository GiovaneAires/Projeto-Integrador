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
import vo.PizzaVO;

/**
 *
 * @author Giovane
 */
public class PizzaPers {
    final int PIZZA = 1;
    Conexao conexao;
        
    public PizzaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <PizzaVO> buscarPizza(PizzaVO pizzaVO) throws SQLException, Exception {

        ArrayList <PizzaVO> pizza = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            sql = "SELECT pro_codigo, pro_nome, pro_ingredientes, pro_tipo, pro_preco, pro_status "
                    + "FROM produto "
                    + "WHERE pro_identificador = " + PIZZA;
             
            if(pizzaVO.getCodigo() != 0)
                sql = sql + " AND pro_codigo = " + pizzaVO.getCodigo(); 

            if(pizzaVO.getSabor() != null)
                sql = sql + " AND pro_nome LIKE '%" + pizzaVO.getSabor() + "%'";
            
            if("Ativo".equals(pizzaVO.getStatus()))
                sql = sql + " AND pro_status = 'Ativo'";
            
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {

                PizzaVO pizVO = new PizzaVO();
                
                pizVO.setCodigo(consulta.getInt("pro_codigo"));
                pizVO.setSabor(consulta.getString("pro_nome"));
                pizVO.setIngredientes(consulta.getString("pro_ingredientes"));
                pizVO.setTipo(consulta.getString("pro_tipo"));
                pizVO.setPreco(consulta.getDouble("pro_preco"));
                pizVO.setStatus(consulta.getString("pro_status"));
                
                pizza.add(pizVO);
            }
            return pizza;
        } finally {
            conexao.desconectar();   
        }
    }
    
    public void gravarPizza(PizzaVO pizVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
             
            if(pizVO.getCodigo() == 0){
                sql = "INSERT INTO produto (pro_identificador, pro_nome, pro_tipo, pro_ingredientes, pro_preco, pro_status) VALUES ("
                        + PIZZA + ", "
                        + "'" + pizVO.getSabor()+ "', "
                        + "'" + pizVO.getTipo() + "', "
                        + "'" + pizVO.getIngredientes()+ "', "
                        + pizVO.getPreco() + ", "
                        + "'" + pizVO.getStatus() + "'"
                        + ");";
            }else{
                sql = "UPDATE produto SET "
                        + "pro_nome = '" + pizVO.getSabor()+ "', "
                        + "pro_tipo = '" + pizVO.getTipo() + "', "
                        + "pro_ingredientes = '" + pizVO.getIngredientes()+ "', "
                        + "pro_preco = " + pizVO.getPreco() + ", "
                        + "pro_status = '" + pizVO.getStatus() + "' "
                        + "WHERE pro_codigo = " + pizVO.getCodigo();
            }
            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
