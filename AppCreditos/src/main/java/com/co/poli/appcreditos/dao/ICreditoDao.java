/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.appcreditos.dao;

import com.co.poli.appcreditos.model.credito;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ICreditoDao {
    String crearCredito(credito Credito);
        List<credito> creLista();
      List<credito> creListb();
     List<credito> creListc();
    List<credito> creListd();
   
   // Usuario obtenerCredito(String email, String clave);
}
