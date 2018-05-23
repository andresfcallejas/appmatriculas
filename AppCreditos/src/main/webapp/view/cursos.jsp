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
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/CursoServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtid" type="text" 
                                       class="form-control" 
                                       placeholder="Codigo">
                            </div>
                            <div class="col"></div>                           
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtcurso" type="text" 
                                       class="form-control" 
                                       placeholder="Curso">
                            </div>
                            <div class="col">
                                <input name="txthoras" type="text" 
                                       class="form-control" 
                                       placeholder="horas">
                            </div>                           
                        </div>  
                        <div class="form-row">
                            <div class="col">
                                <input name="txtvalor" type="text" 
                                       class="form-control" 
                                       placeholder="Valor Curso">
                            </div>
                            <div class="col">
                                <select name="txtestado" id="inputState" 
                                        class="form-control">
                                    <option value="TRUE" selected>Activo</option>
                                    <option value="FALSE" >Inactivo</option>
                                </select>
                            </div>                          
                        </div>   
                        
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="crear" type="submit" 
                                        class="btn btn-primary">
                                    Registrar
                                </button>
                            </div>
                            <div class="col">
                              <!--  <button name="accion" value="listar" type="submit" 
                                        class="btn btn-primary">
                                    Listar Usuarios
                                </button> -->
                            </div>                         
                    </form>
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
