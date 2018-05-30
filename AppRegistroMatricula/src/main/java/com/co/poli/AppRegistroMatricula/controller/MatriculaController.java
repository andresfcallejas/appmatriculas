/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.controller;

import com.co.poli.AppRegistroMatricula.business.implement.ImplMateriaBus;
import com.co.poli.AppRegistroMatricula.model.Materia;
import java.nio.file.Path;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Usuario
 */
  @RestController
@RequestMapping (value = "/")
public class MatriculaController {
      @Autowired
      private ImplMateriaBus materiImpl;
      
    @PostMapping("/materia/{idMateria}")
    public String crearMateria(@RequestBody Materia materia, HttpServletResponse hsr){
        return materiImpl.crearMateria(materia);
        
    }
    
    @GetMapping("/status")
    public String MatriculaController(){
    return "running server";
    }
}
