/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.sql.SQLException;
import java.util.ArrayList;
import persistencia.BordaPers;
import vo.BordaVO;

/**
 *
 * @author Giovane
 */
public class BordaRN {
    public BordaRN(){
        
    }
    
    public ArrayList<BordaVO> buscarBorda(BordaVO bordaVO) throws SQLException, Exception{
        BordaPers borPers = new BordaPers();
        return borPers.buscarBorda(bordaVO);
    }
    
    public void gravarBorda(BordaVO borVO) throws SQLException, Exception{
        BordaPers borPers = new BordaPers();
        borPers.gravarBorda(borVO);
    }
}
