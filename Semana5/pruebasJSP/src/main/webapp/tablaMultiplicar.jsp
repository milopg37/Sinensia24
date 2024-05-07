<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tablas Multiplicar</title>
</head>
<body>

 <h2>Tabla de Multiplicar del 1</h2>
    <ul>
        <% 
        int tablaUno = 1;
        for(int i = 1; i <= 10; i++) { 
        %>
            <li><%= tablaUno %> x <%= i %> = <%= tablaUno * i %></li>
        <% 
        } 
        %>
    </ul>
    
     <h2>Tabla de Multiplicar del 2</h2>
    <ul>
        <% 
        int tablaDos = 2;
        for(int i = 1; i <= 10; i++) { 
        %>
            <li><%= tablaDos %> x <%= i %> = <%= tablaDos * i %></li>
        <% 
        } 
        %>
    </ul>


</body>
</html>