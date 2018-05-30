/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.business.implement;

import com.co.poli.AppRegistroMatricula.business.IregistroBusiness;
import com.co.poli.AppRegistroMatricula.dao.implent.implRegistro;
import com.co.poli.AppRegistroMatricula.model.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImplRegistroBus implements IregistroBusiness{
implRegistro regiimpl = new implRegistro();
    @Override
    public List<Registro> obtenerListaRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
        return regiimpl.obtenerRegistro(idRegistro);
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String crearRegistro(Registro registro) {
   String respuesta = "Curso ya existe";
        Registro regNuevo = obtenerRegistro(registro.getIdRegistro());
        if (regNuevo == null) {
            respuesta = regiimpl.crearRegistro(registro);
        }
        return respuesta;     
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
