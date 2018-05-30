/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.dao.implent;

import com.co.poli.AppRegistroMatricula.dao.daoMateria;
import com.co.poli.AppRegistroMatricula.data.dataMateria;
import com.co.poli.AppRegistroMatricula.model.Materia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImplMateria implements daoMateria {

    @Override
    public List<Materia> obtenerListaMateria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Materia obtenerMateria(String idMateria) {
        List<Materia> list = dataMateria.getListaMateria();
        Materia m = null;
        for (Materia materia : list) {
            if (idMateria.equals(materia.getIdMateria())) {
                m = materia;//new Materia(materia.getIdMateria(), materia.getNombre(), materia.getNumCreditos(), materia.getCupoMin(), materia.getCupoMax());
            }
        }
        return m;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String crearMateria(Materia materia) {
        List<Materia> listaMateria = dataMateria.getListaMateria();
        listaMateria.add(materia);
        dataMateria.setListaMateria(listaMateria);
        return "Materia Creado";

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
