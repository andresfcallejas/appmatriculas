/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.business;

import com.co.poli.AppRegistroMatricula.model.Registro;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IregistroBusiness {
     List<Registro> obtenerListaRegistro();
    Registro obtenerRegistro(String idRegistro);
    String crearRegistro(Registro registro);
   // String modificarCurso(Curso curso);
    String eliminarRegistro(String idRegistro);
    int countRegitros(String idRegistro);
}
