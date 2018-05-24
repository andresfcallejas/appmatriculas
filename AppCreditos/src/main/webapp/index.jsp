
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
                          action="${pageContext.servletContext.contextPath}/creditoServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtidcredito" type="text" 
                                       class="form-control" 
                                       placeholder="Numero Credito">
                            </div>
                            <div class="col"></div>                           
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" 
                                       class="form-control" 
                                       placeholder="Documento">
                            </div>
                            <div class="col">
                                <input name="txtnombres" type="text" 
                                       class="form-control" 
                                       placeholder="Nombre y Apellidos">
                            </div>                           
                        </div>  
                        <div class="form-row">
                            <div class="col">
                                <input name="txtmonto" type="email" 
                                       class="form-control" 
                                       placeholder="Monto">
                            </div>
                        <div class="col">
                                <select name="txttrabajador" id="inputState" 
                                        class="form-control">
                                    <option value="independiente" selected>Independiente</option>
                                    <option value="dependiente" >Dependiente</option>
                                </select>
                            </div>                          
                        </div>   
                        
                        <div class="form-row">
                  
                        <div class="col">
                           
                            <div class="col">
                                <select name="txttcredito" id="inputState" 
                                        class="form-control">
                                    <option value="vivienda" selected>Vivienda</option>
                                    <option value="estudio">Estudio</option>
                                    <option value="libreInversion">Libre Inversion</option>
                                </select>
                            </div>    
                                   <select name="txtactivo" id="inputState" 
                                        class="form-control">
                                    <option value="TRUE" selected>Si</option>
                                    <option value="FALSE" >No</option>
                                </select>
                            </div>  
                            
                        </div>   
                        
                        
                        
                        <div class="form-row">
                
                                                   
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
