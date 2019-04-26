<%-- 
    Document   : Noticia
    Created on : 24/04/2019, 05:05:37 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>Crear Noticias</h1>
        <form action="NoticiasServlet.do" method="POST" >
            <input type="text" name="txtTitulo" id="txtUsuario" placeholder="Coloca titulo" ></br></br>
            <input type="text" name="txtUrl" id="txtUsuario" placeholder="Coloca url" ></br></br>
            <input type="text" name="txtTexto" id="txtUsuario" placeholder="Coloca texto" ></br></br>

            <input type="submit" value="Enviar">
        </form>
        
    </body>
</html>
