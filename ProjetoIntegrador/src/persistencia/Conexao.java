/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Giovane
 */
public class Conexao {
    public Connection con = null;

    public Connection conectar() throws ClassNotFoundException, SQLException, Exception {
        String url = "jdbc:mysql://localhost/projeto";
        String user = "giovane";
        String pass = "root";
        con = DriverManager.getConnection(url,user,pass);
        return con;
    }

    public Connection desconectar() throws SQLException, Exception {
        con.close();
        return con;
    }    
}
