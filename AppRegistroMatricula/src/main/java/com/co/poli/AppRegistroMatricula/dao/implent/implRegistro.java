/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.dao.implent;

import com.co.poli.AppRegistroMatricula.dao.daoRegistro;
import com.co.poli.AppRegistroMatricula.data.dataRegistro;
import com.co.poli.AppRegistroMatricula.model.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class implRegistro implements daoRegistro{

    @Override
    public List<Registro> obtenerListaRegistro() {
  return dataRegistro.getListaRegistro();
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Registro obtenerRegistro(String idRegistro) {
List<Registro> list = dataRegistro.getListaRegistro();
Registro r = null;
        for (Registro registro : list) {
            if (registro.getIdRegistro().equals(idRegistro)) {
                r= registro;
            }
        }
        return r;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String crearRegistro(Registro registro) {
       List<Registro> listaRegistros = dataRegistro.getListaRegistro();
        listaRegistros.add(registro);
        dataRegistro.setListaRegistro(listaRegistros);
        return "Registro Creado";
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
       List<Registro> listaRegistros = dataRegistro.getListaRegistro();
        listaRegistros.remove(idRegistro);
        dataRegistro.setListaRegistro(listaRegistros);
        return "Registro Eliminado";
//  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
