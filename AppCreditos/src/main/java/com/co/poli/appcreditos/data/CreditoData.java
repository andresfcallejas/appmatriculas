/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.appcreditos.data;


import com.co.poli.appcreditos.model.credito;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class CreditoData {
    private static List<credito> listacreditos;
static{
        
        listacreditos = new ArrayList<credito>(){
            {
                add(new credito("10", "1020", "Maria Garcia", 5000000.0 
                                    , "Independiente", "Vivienda", Boolean.TRUE));
                add(new credito("20", "1030", "Carlos Garcia", 10000000.0 
                                    , "Dependiente", "Estudio", Boolean.TRUE));                
            }
        };
    }
    public static List<credito> getListacreditos() {
        return listacreditos;
    }

    public static void setListacreditos(List<credito> aListacreditos) {
        listacreditos = aListacreditos;
    }
    
}
