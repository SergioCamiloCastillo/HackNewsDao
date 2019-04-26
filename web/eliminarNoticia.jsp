<%-- 
    Document   : eliminarNoticia
    Created on : 26/04/2019, 11:47:08 AM
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
        <p>Eliminar noticia</p>
        <form action="NoticiasServlet.do" method="GET">
            <input type="text" name="txtEliminarNoticia"  placeholder="Coloque id"></br></br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
