<%-- 
    Document   : menu
    Created on : 2/05/2018, 06:36:48 PM
    Author     : giovanny
--%>

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
                        <caption>Lista de Cursos</caption>
                        <thead>
                            <tr>
                                <th scope="col">Codigo</th>
                                <th scope="col">Curso</th>
                                <th scope="col">Apellidos</th>
                                <th scope="col">Horas</th>
                                <th scope="col">Valor Curso</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Accion</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="curso" items="${sessionScope.LISTADOCURSO}">
                                <tr>

                                    <td><c:out value="${curso.getIdCurso()}"/></td>
                                    <td><c:out value="${curso.getNombre()}"/></td>
                                    <td><c:out value="${curso.getHoras()}"/></td>
                                    <td><c:out value="${curso.getValorCurso()}"/></td>
                                    <td><c:out value="${curso.getEstado()}"/></td>
                                    <td>
                                        <div class="col">
                                            <form  method="post" action="${pageContext.servletContext.contextPath}/CursoServlet">
                                                <input name="txtid" type="hidden" value="${curso.getIdCurso()}">
                                                <button name="accion" value="eliminar" class="btn btn-danger">
                                                    Eliminar                                                   
                                                </button>                                            
                                                <button name="accion" value="actualizar" class="btn btn-primary">
                                                    Actualizar
                                                </button>                                                    
                                            </form>
                                        </div>
                                    </td>      
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
