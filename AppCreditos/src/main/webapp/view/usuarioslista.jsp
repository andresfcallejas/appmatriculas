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
                                <tr>
                                    <td><c:out value="${usuario.getDocumento()}"/></td>
                                    <td><c:out value="${usuario.getNombres()}"/></td>
                                    <td><c:out value="${usuario.getApellidos()}"/></td>
                                    <td><c:out value="${usuario.getEmail()}"/></td>
                                    <td><c:out value="${usuario.getEstado()}"/></td>
                                    <td><c:out value="${usuario.getRol()}"/></td>
                                    <td>
                                        <div class="col">
                                            <form  method="post" action="${pageContext.servletContext.contextPath}/UsuariosServlet">
                                                <input name="txtdocumento" type="hidden" value="${usuario.getDocumento()}">
                                                <button name="accion" value="eliminar" class="btn btn-danger">
                                                    Eliminar                                                   
                                                </button>                                            
                                                <button name="accion" value="actualizar" class="btn btn-primary">
                                                    Actualizar
                                                </button>                                                    
                                            </form>
                                        </div>
                                    </td>                                    
                                </tr>
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
