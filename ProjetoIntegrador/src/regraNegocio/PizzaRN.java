/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import persistencia.PizzaPers;
import vo.PizzaVO;

/**
 *
 * @author Giovane
 */
public class PizzaRN {
    public PizzaRN(){
        
    }
    
    public void inserirPizza(PizzaVO pizVO) throws SQLException, Exception{
        PizzaPers pizPers = new PizzaPers();
        pizPers.inserirPizza(pizVO);
    }
    
    public void editarPizza(PizzaVO pizVO) throws SQLException, Exception{
        PizzaPers pizPers = new PizzaPers();
        pizPers.editarPizza(pizVO);
    }
}
