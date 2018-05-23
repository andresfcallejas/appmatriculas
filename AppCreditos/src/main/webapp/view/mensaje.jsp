<%-- 
    Document   : mensaje
    Created on : 25/04/2018, 07:24:29 PM
    Author     : Usuario
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../../../favicon.ico">

    <title>Jumbotron Template for Bootstrap</title>

   
    <title>Signin Template for Bootstrap</title>

   
    <link  rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"  >

   
    <link href="../../assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

  
    <link href="${pageContext.servletContext.contextPath}/css/signin.css" rel="stylesheet">
     <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">

     <script src="../../assets/js/ie-emulation-modes-warning.js"></script>
  </head> 
    <body>
         <%@include file="/META-INF/jspf/bodymenu.jspf" %>
        <h1>
            <c:out value="${sessionScope.MENSAJE}"></c:out>
            <a href="${pageContext.servletContext.contextPath}/index.jsp">Volver al Login</a>
        </h1>
    </body>
</html>
