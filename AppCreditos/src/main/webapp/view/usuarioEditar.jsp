<%-- 
    Document   : menu
    Created on : 2/05/2018, 06:36:48 PM
    Author     : giovanny

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<%@include file="/META-INF/jspf/header.jspf" %>

    <body>

 <%@include file="/META-INF/jspf/bodymenu.jspf" %>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                        <table class="table">
                        <caption>Lista de Usuarios</caption>
                        <thead>
                            <tr>
                                <th scope="col">Documento</th>
                                <th scope="col">Nombres</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Email</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Rol</th>
                                <th scope="col">Acción</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="usuario" items="${sessionScope.LISTADO}">
                                <c:choose>
                                    <c:when test="${usuario.getDocumento() == sessionScope.documento}">
                                        <tr>                                            
                                            <form  method="post" action="${pageContext.servletContext.contextPath}/UsuariosServlet">
                                                <td><input style="width: 60%" name="" disabled type="text" value="<c:out value='${usuario.getDocumento()}' />"></td>
                                                <input name="txtdocumento" type="hidden" value="<c:out value='${usuario.getDocumento()}' />">
                                                <td><input name="txtnombres" type="text" value="<c:out value='${usuario.getNombres()}'/>"></td>
                                                <td><input name="txtapellidos" type="text" value="<c:out value='${usuario.getApellidos()}'/>"></td>
                                                <td><input name="txtemail" type="text" value="<c:out value='${usuario.getEmail()}'/>"></td>
                                                <td><input style="width: 100%;" name="txtestado" type="text" value="<c:out value='${usuario.getEstado()}'/>"></td>
                                                <td><input style="width: 120px" name="txtrol" type="text" value="<c:out value='${usuario.getRol()}'/>"></td>
                                                <td>
                                                    <div class="col">
                                                        <button name="accion" value="save" class="btn btn-success">Actualizar</button>                                                    
                                                    </div>
                                                </td>                                    
                                            </form>
                                        </tr>
                                        
                                    </c:when>
                                    <c:otherwise>
                                        <tr>
                                            <td><c:out value="${usuario.getDocumento()}"/></td>
                                            <td><c:out value="${usuario.getNombres()}"/></td>
                                            <td><c:out value="${usuario.getApellidos()}"/></td>
                                            <td><c:out value="${usuario.getEmail()}"/></td>
                                            <td><c:out value="${usuario.getEstado()}"/></td>
                                            <td><c:out value="${usuario.getRol()}"/></td>
                                            <td></td>                                    
                                        </tr>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    </body>
</html>
