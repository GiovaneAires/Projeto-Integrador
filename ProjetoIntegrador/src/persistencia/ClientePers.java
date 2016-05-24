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
import vo.ClienteVO;

/**
 *
 * @author Giovane
 */
public class ClientePers {
    Conexao conexao;
    public ClientePers(){
        this.conexao = new Conexao();
    }

    public ArrayList <ClienteVO> buscarCliente() throws SQLException, Exception {

        ArrayList <ClienteVO> cliente = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            
            con = conexao.conectar();
            stm = con.createStatement();
            consulta = stm.executeQuery("SELECT * FROM cliente;");

            while (consulta.next()) {
                ClienteVO cliVO = new ClienteVO();
               
                cliente.add(cliVO);
            }
        } finally {
            conexao.desconectar();
            return cliente;
        }
    }
    
    public void inserirCliente(ClienteVO cliVO) {
        
    }

    public void editarCliente(ClienteVO cliVO) {
        
    }
}
