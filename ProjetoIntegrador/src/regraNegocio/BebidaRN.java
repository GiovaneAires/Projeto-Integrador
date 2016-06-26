/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.BebidaPers;
import vo.BebidaVO;

/**
 *
 * @author Giovane
 */
public class BebidaRN {
    
    public BebidaRN(){
        
    }
    
    public ArrayList<BebidaVO> buscarBebida(BebidaVO bebidaVO) throws SQLException, Exception{
        BebidaPers bebPers = new BebidaPers();
        return bebPers.buscarBebida(bebidaVO);
    }
    
    public void gravarBebida(BebidaVO bebVO) throws SQLException, Exception{
        BebidaPers bebPers = new BebidaPers();
        bebPers.gravarBebida(bebVO);
    }
}
