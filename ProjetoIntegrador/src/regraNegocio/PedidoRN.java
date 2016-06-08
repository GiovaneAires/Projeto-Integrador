/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PedidoPers;
import vo.PedidoVO;

/**
 *
 * @author Giovane
 */
public class PedidoRN {
    public PedidoRN(){
        
    }
    
    public ArrayList<PedidoVO> buscarPedido() throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        return pedPers.buscarPedido();
    }
    
    public void gravarPedido(PedidoVO pedVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        pedPers.gravarPedido(pedVO);
    }
}
