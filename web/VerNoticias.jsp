<%-- 
    Document   : VerNoticias
    Created on : 26/04/2019, 01:07:58 PM
    Author     : User
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="Modelo.NoticiaDaoImpl"%>
<%@page import="Modelo.NoticiaDao"%>
<%@page import="Modelo.Noticia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%

            NoticiaDao noticia = new NoticiaDaoImpl();
            Noticia p = noticia.read(26);
            out.println(p.getId()+p.getTitulo()+p.getUrl()+p.getTexto()+p.getFecha());
        %>
    </body>
</html>
