<%-- 
    Document   : listarcreditos
    Created on : 23/05/2018, 07:15:23 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="/META-INF/jspf/header.jspf" %>
    </head>
    <body>
       <%@include file="/META-INF/jspf/bodymenu.jspf" %>
       <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <table class="table">
                        <caption>Lista de Creditos</caption>
                        <thead>
                            <tr>
                                <th scope="col">Codigo Credito</th>
                                <th scope="col">Documento</th>
                                <th scope="col">Nombre Y apellido</th>
                                <th scope="col">Monto</th>
                                <th scope="col">Tipo Trabajador</th>
                                <th scope="col">Tipo Credito</th>
                                <th scope="col">Activo</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="credito" items="${sessionScope.LISTAA}">
                                <tr>

                                    <td><c:out value="${credito.getIdCredito()}"/></td>
                                    <td><c:out value="${credito.getDocumento()}"/></td>
                                    <td><c:out value="${credito.getNommbres()}"/></td>
                                    <td><c:out value="${credito.getMonto()}"/></td>
                                    <td><c:out value="${credito.getTipoTrabajador()}"/></td>
                                    <td><c:out value="${credito.getTipoCredito()}"/></td>
                                    <td><c:out value="${credito.getActivo()}"/></td>
                                   
                                </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </main>
    </body>
</html>
