/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import persistencia.ClientePers;
import vo.ClienteVO;

/**
 *
 * @author Giovane
 */
public class ClienteRN {
    public ClienteRN(){
        
    }
    
    public void inserirCliente(ClienteVO cliVO) throws SQLException, Exception{
        ClientePers cliPers = new ClientePers();
        cliPers.inserirCliente(cliVO);
    }
    
    public void editarCliente(ClienteVO cliVO) throws SQLException, Exception{
        ClientePers cliPers = new ClientePers();
        cliPers.editarCliente(cliVO);
    }
}
