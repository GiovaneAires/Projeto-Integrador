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
    Conexao conexao;
    public BordaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <BordaVO> buscarBorda() throws SQLException, Exception {

        ArrayList <BordaVO> borda = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            
            con = conexao.conectar();
            stm = con.createStatement();
            consulta = stm.executeQuery("SELECT * FROM borda;");

            while (consulta.next()) {

                BordaVO borVO = new BordaVO();
                
                borda.add(borVO);
            }

        } finally {
            conexao.desconectar();
            return borda;
        }
    }
    
    public void gravarBorda(BordaVO borVO){
        String sql;
        
        if(borVO.getCodigo() == 0){
            sql = "insert";
        }else{
            sql = "update";
        }
            
    }
}
