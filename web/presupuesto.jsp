<%-- 
    Document   : presupuesto
    Created on : 26/03/2015, 26/03/2015 09:43:41 AM
    Author     : Aprendiz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="shortcut icon" href="css/favicon.ico" />
        <link rel="icon" href="favicon.ico" type="image/x-icon" />
        <title>Arma tu pc</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilo.css" type="text/css" >
        <link href='http://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
      <link href='http://fonts.googleapis.com/css?family=Ubuntu+Condensed' rel='stylesheet' type='text/css'>
    </head>
    <body class="body1">
        <!--formulario donde esta el textbox principal y boton principal de la aplicacion-->
        <!-- Me gustaría saber por qué redirige a Descripcion.jsp -->
    <div class="form">
        <form action="Servlet" method="post" >
            <h1>Arma  <small>tu pc.</small> </h1>
            <input class="tex" type="text" placeholder="Ingresa tu presupuesto" name="saldo"/><br>
            <input class="bot" type="submit" value="Consultar"/>   
        </form>
    </div> 
       
        
    </body>
</html>
