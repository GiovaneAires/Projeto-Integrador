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
    
    public void gravarPedido(PedidoVO pedVO){
        
    }
}
