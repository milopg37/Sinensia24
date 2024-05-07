<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pintar Numero Ingresado</title>
<link rel="stylesheet" type="text/css" href="styles/estilosPintarNumRequerido.css">
</head>
<body>

<!-- Form para ingresar numero a printear su tabla -->
<form action="#" method="POST">
    <label for="numero">Ingresa un número:</label><br>
    <input type="number" id="numero" name="numero" min="0" max="100"><br><br>
    <input type="submit" value="Enviar">
</form>


<!-- Logica JSP -->

<% 
	if("POST".equalsIgnoreCase(request.getMethod())){ //Si hay post en el form
		int numero = Integer.parseInt(request.getParameter("numero")); //Parseo
%>
		 <ul>
	        
	        <% int tablaNUmero = numero; 
	        for(int i = 1; i <= 10; i++) { 
	        %>
	            <li><%= tablaNUmero %> x <%= i %> = <%= tablaNUmero * i %></li>
	        <%
	        } 
	        %>
	    </ul>
	 <%
	}
%>


</body>
</html>