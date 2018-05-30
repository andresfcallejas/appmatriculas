/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.data;

import com.co.poli.AppRegistroMatricula.model.Materia;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class dataMateria {

    private static List<Materia> listaMateria;

    static {

        listaMateria = new ArrayList<Materia>() {

            {
                add(new Materia("1010", "Calculo", 4.0, 15.0, 30.0));
                add(new Materia("1020", "programacion", 2.0, 15.0, 30.0));
                add(new Materia("1030", "algebra", 3.0, 15.0, 30.0));
                add(new Materia("1040", "pdp", 2.0, 15.0, 30.0));

            }
        };
    }

    public static List<Materia> getListaMateria() {
        return listaMateria;
    }

    public static void setListaMateria(List<Materia> aListaMateria) {
        listaMateria = aListaMateria;
    }
}
