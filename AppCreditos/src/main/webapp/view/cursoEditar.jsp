<%-- 
    Document   : cursoEditar
    Created on : 20/05/2018, 02:08:08 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
                                <th scope="col">Codigo Cursos</th>
                                <th scope="col">Nombres</th>
                                <th scope="col">Horas</th>
                                <th scope="col">Valor</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Acción</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="curso" items="${sessionScope.LISTADOCURSO}">
                                <c:choose>
                                    <c:when test="${curso.getIdCurso() == sessionScope.CodigoCurso}">
                                        <tr>                                            
                                            <form  method="post" action="${pageContext.servletContext.contextPath}/CursoServlet">
                                                <td><input style="width: 60%" name="" disabled type="text" value="<c:out value='${curso.getIdCurso()}' />"></td>
                                                <input name="txtid" type="hidden" value="<c:out value='${curso.getIdCurso()}' />">
                                                <td><input name="txtcurso" type="text" value="<c:out value='${curso.getNombre()}'/>"></td>
                                                <td><input name="txthoras" type="text" value="<c:out value='${curso.getHoras()}'/>"></td>
                                                <td><input name="txtvalor" type="text" value="<c:out value='${curso.getValorCurso()}'/>"></td>
                                                <td><input style="width: 100%;" name="txtestado" type="text" value="<c:out value='${curso.getEstado()}'/>"></td>
                                               
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
                                            <td><c:out value="${curso.getIdCurso()}"/></td>
                                            <td><c:out value="${curso.getNombre()}"/></td>
                                            <td><c:out value="${curso.getHoras()}"/></td>
                                            <td><c:out value="${curso.getValorCurso()}"/></td>
                                            <td><c:out value="${curso.getEstado()}"/></td>
                                         
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
