/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.AppRegistroMatricula.controller;

import com.co.poli.AppRegistroMatricula.business.implement.ImplRegistroBus;
import com.co.poli.AppRegistroMatricula.model.Registro;
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
public class RegistroCtrl {
    @Autowired
      private ImplRegistroBus regImpl;
      
    @PostMapping("/registro/{idRegistro}")
    public String crearRegistro(@RequestBody Registro registro, HttpServletResponse hsr){
        return regImpl.crearRegistro(registro);
        
    }
    
    @DeleteMapping("/registro/{idRegistro}")
    public String eliminarRegistro(@PathVariable String id_registro, HttpServletResponse hsr){
        return regImpl.eliminarRegistro(id_registro);
        
    }
    
    @GetMapping("/status")
    public String MatriculaController(){
    return "running server";
    }
}
