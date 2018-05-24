/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.poli.appcreditos.controller;

import com.co.poli.appcreditos.dao.implementation.CreditoDaoImpl;
import com.co.poli.appcreditos.model.credito;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Usuario
 */
public class creditoServlet extends HttpServlet {
    String idCredito;
     String Documento;
     String Nommbres;
    
    Double Monto;
     String tipoTrabajador;
     String tipoCredito;
    Boolean activo;
    credito Credito;
    String mensaje;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        CreditoDaoImpl creditoDaoImpl = new CreditoDaoImpl();
     
        String CodigoCurso = request.getParameter("txtidcredito");
           String accion = request.getParameter("accion");

        List<credito> listacreditos;

        switch (accion) {
            case "crear":
        this.idCredito = request.getParameter("txtidcredito");
        this.Documento = request.getParameter("txtdocumento");
        this.Nommbres = request.getParameter("txtnombres");
        this.Monto = Double.valueOf(request.getParameter("txtmonto"));
        this.tipoTrabajador = request.getParameter("txttrabajador");
        this.tipoCredito = request.getParameter("txttcredito");
        this.activo = Boolean.getBoolean(request.getParameter("txtactivo"));
       Credito = new credito(idCredito, Documento, Nommbres, Monto, tipoTrabajador, tipoCredito, activo);
             

                mensaje = creditoDaoImpl.crearCredito(Credito);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/index.jsp");
                break;
            case "alistar":
                listacreditos = creditoDaoImpl.creLista();
                session.setAttribute("LISTAA", listacreditos);
                rd = request.getRequestDispatcher("/view/paginaa.jsp");
                

                break;
            case "blistar":
                session.setAttribute("CodigoCurso", CodigoCurso);
                rd = request.getRequestDispatcher("/view/cursoEditar.jsp");

                break;
            case "clistar":
                session.setAttribute("CodigoCurso", CodigoCurso);
                rd = request.getRequestDispatcher("/view/cursoEditar.jsp");

                break;
            case "dlistar":
                session.setAttribute("CodigoCurso", CodigoCurso);
                rd = request.getRequestDispatcher("/view/cursoEditar.jsp");

                break;


            default:
                break;
        }
        rd.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
