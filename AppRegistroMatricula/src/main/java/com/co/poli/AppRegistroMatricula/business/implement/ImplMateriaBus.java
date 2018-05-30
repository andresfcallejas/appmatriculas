/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.business.implement;

import com.co.poli.AppRegistroMatricula.business.ImateriaBusiness;
import com.co.poli.AppRegistroMatricula.dao.implent.ImplMateria;
import com.co.poli.AppRegistroMatricula.model.Materia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImplMateriaBus implements ImateriaBusiness{
ImplMateria implmat = new ImplMateria();
    @Override
    public List<Materia> obtenerListaMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
       return implmat.obtenerMateria(idMateria);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String crearMateria(Materia materia) {
    String respuesta = "Curso ya existe";
        Materia matNuevo = obtenerMateria(materia.getIdMateria());
        if (matNuevo == null) {
            respuesta = implmat.crearMateria(materia);
        }
        return respuesta;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}
