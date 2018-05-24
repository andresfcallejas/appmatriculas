/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.appcreditos.dao.implementation;

import com.co.poli.appcreditos.dao.ICreditoDao;
import com.co.poli.appcreditos.data.CreditoData;
import com.co.poli.appcreditos.model.credito;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CreditoDaoImpl implements ICreditoDao{

    @Override
    public List<credito> creLista() {
       List<credito> list =  CreditoData.getListacreditos();  
        return list;
    }

    @Override
    public List<credito> creListb() {
       List<credito> list =  CreditoData.getListacreditos();
        for (credito object : list) {
            
        }
        return list;
    }

    @Override
    public List<credito> creListc() {
        List<credito> list =  CreditoData.getListacreditos();
        for (credito object : list) {
            
        }
        return list;
    }

    @Override
    public List<credito> creListd() {
         List<credito> list =  CreditoData.getListacreditos();
        for (credito object : list) {
            
        }
        return list;
    }

    @Override
    public String crearCredito(credito Credito) {
    List<credito> list = CreditoData.getListacreditos();
        list.add(Credito);
     CreditoData.setListacreditos(list);
        return "Credito Creado"; }

   
}
