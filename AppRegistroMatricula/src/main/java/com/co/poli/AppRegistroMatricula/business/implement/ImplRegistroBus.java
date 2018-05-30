/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.business.implement;

import com.co.poli.AppRegistroMatricula.business.IregistroBusiness;
import com.co.poli.AppRegistroMatricula.dao.implent.implRegistro;
import com.co.poli.AppRegistroMatricula.model.Materia;
import com.co.poli.AppRegistroMatricula.model.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class ImplRegistroBus implements IregistroBusiness {

    implRegistro regiimpl = new implRegistro();
    ImplMateriaBus implMateriaBus = new ImplMateriaBus();

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
            //respuesta = "c"

            if (registro.getMateria().getCupoMax() > countRegitros(registro.getIdRegistro())) {
                List<Registro> list = regiimpl.obtenerListaRegistro();
                List<Materia> listM = implMateriaBus.obtenerListaMateria();
                for (Materia materia : listM) {
                    if (materia.getIdMateria().equals(registro.getMateria().getIdMateria())) {
                        respuesta = "materia ya matriculada";
                    } else {
                        respuesta = regiimpl.crearRegistro(registro);
                    }
                }
            } else {
                respuesta = "Cupo max ";
            }
        }
        return respuesta;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminarRegistro(String idRegistro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int countRegitros(String idRegistro) {
        int con = 0;
        List<Registro> list = regiimpl.obtenerListaRegistro();
        for (Registro registro : list) {
            if (registro.getIdRegistro().equals(idRegistro)) {
                con++;
            }
        }
        return con;
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
