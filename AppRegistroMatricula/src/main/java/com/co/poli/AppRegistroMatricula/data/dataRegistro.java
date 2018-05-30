/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.data;

import com.co.poli.AppRegistroMatricula.model.Materia;
import com.co.poli.AppRegistroMatricula.model.Registro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class dataRegistro {
    private static List<Registro> listaRegistro;
    static {
        listaRegistro = new ArrayList<Registro>(){
            {
                add(new Registro("10", "1234", new Materia("1010", "Calculo", 4.0, 15.0, 30.0), "A",25000.0));
                add(new Registro("20", "1234", new Materia("1010", "Calculo", 4.0, 15.0, 30.0), "B",43000.0));
            }
        };
    
    
    }

    public static List<Registro> getListaRegistro() {
        return listaRegistro;
    }

    public static void setListaRegistro(List<Registro> aListaRegistro) {
        listaRegistro = aListaRegistro;
    }
    
}
