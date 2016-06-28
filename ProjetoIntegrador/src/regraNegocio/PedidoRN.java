/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PedidoPers;
import vo.ClienteVO;
import vo.PedidoItemVO;
import vo.PedidoVO;
import vo.RelatorioVO;

/**
 *
 * @author Giovane
 */
public class PedidoRN {
    public PedidoRN(){
        
    }
    
    public ArrayList<RelatorioVO> gerarRelatorioCliente(ClienteVO clienteVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        return pedPers.gerarRelatorioCliente(clienteVO);
    }
    
    public ArrayList<RelatorioVO> gerarRelatorioPeriodo(RelatorioVO relatorioVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        return pedPers.gerarRelatorioPeriodo(relatorioVO);
    }
    
    public int gravarPedido(PedidoVO pedVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        return pedPers.gravarPedido(pedVO);
    }
    
    public void gravarPedidoItem(PedidoItemVO pedItemVO) throws SQLException, Exception{
        PedidoPers pedPers = new PedidoPers();
        pedPers.gravarPedidoItem(pedItemVO);
    }
}
