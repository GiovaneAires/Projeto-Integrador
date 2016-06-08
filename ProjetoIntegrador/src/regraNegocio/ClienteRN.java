/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.ClientePers;
import vo.ClienteVO;

/**
 *
 * @author Giovane
 */
public class ClienteRN {
    public ClienteRN(){
        
    }
    
    public ArrayList<ClienteVO> buscarCliente() throws SQLException, Exception{
        ClientePers cliPers = new ClientePers();
        return cliPers.buscarCliente();
    }
    
    public void gravarCliente(ClienteVO cliVO) throws SQLException, Exception{
        ClientePers cliPers = new ClientePers();
        cliPers.gravarCliente(cliVO);
    }
}
