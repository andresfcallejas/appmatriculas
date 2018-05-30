/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.business;

import com.co.poli.AppRegistroMatricula.model.Materia;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface ImateriaBusiness {
    List<Materia> obtenerListaMateria();
    Materia obtenerMateria(String idMateria);
    String crearMateria(Materia materia);
   // String modificarCurso(Curso curso);
    //String eliminarCurso(String idMateria);
}
