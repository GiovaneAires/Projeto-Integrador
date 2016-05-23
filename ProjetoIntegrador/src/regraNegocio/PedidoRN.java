/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import persistencia.PedidoPers;
import vo.PedidoVO;

/**
 *
 * @author Giovane
 */
public class PedidoRN {
    public PedidoRN(){
        
    }
    
    public void inserirPedido(PedidoVO pedVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        pedPers.inserirPedido(pedVO);
    }
    
    public void editarPedido(PedidoVO pedVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        pedPers.editarPedido(pedVO);
    }
}
