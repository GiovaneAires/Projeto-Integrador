/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.PizzaPers;
import vo.PizzaVO;

/**
 *
 * @author Giovane
 */
public class PizzaRN {
    public PizzaRN(){
        
    }
    
    public ArrayList<PizzaVO> buscarPizza() throws SQLException, Exception{
        PizzaPers pizPers = new PizzaPers();
        return pizPers.buscarPizza();
    }
    
    public void gravarPizza(PizzaVO pizVO) throws SQLException, Exception{
        PizzaPers pizPers = new PizzaPers();
        pizPers.gravarPizza(pizVO);
    }
}
