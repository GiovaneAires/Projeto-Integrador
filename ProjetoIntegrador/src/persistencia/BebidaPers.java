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
    Conexao conexao;
    public BebidaPers(){
        this.conexao = new Conexao();
    }
    
    public ArrayList <BebidaVO> buscarBebida() throws SQLException, Exception {
        
        ArrayList <BebidaVO> bebida = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            
            con = conexao.conectar();
            stm = con.createStatement();
            consulta = stm.executeQuery("SELECT * FROM bebida;");

            while (consulta.next()) {

                BebidaVO bebVO = new BebidaVO();
                
                bebida.add(bebVO);
            }
        } finally {
            conexao.desconectar();
            return bebida;
        }
    }
        
    public void gravarBebida(BebidaVO bebVO){
        String sql;
        if(bebVO.getCodigo() == 0){
            sql = "insert";
        }else{
            sql = "update";
        }
    }
}
