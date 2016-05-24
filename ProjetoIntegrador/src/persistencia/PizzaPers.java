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
    Conexao conexao;
    public PizzaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <PizzaVO> buscarPizza() throws SQLException, Exception {

        ArrayList <PizzaVO> pizza = new ArrayList();
        
        try {

            Connection con;
            Statement stm;
            ResultSet consulta;
            
            con = conexao.conectar();
            stm = con.createStatement();
            consulta = stm.executeQuery("SELECT * FROM pizza;");

            while (consulta.next()) {

                PizzaVO pizVO = new PizzaVO();
                
                pizza.add(pizVO);
            }

        } finally {

            conexao.desconectar();
            return pizza;
        }
    }
    
    public void inserirPizza(PizzaVO pizVO){
        
    }
    
    public void editarPizza(PizzaVO pizVO){
        
    }
}
