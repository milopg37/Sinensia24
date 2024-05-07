<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pruebas con JSP</title>
</head>
<body>

<h2>Ejemplo Bucle printeando datos</h2>

<%
for(int i = 0; i < 4; i++){
	out.println("<p>" + i + "</p>");
	}

%>

<%
for(int i = 0; i < 7; i++){%>
	<h<%=i%>>Bienvenido!</h<%=i %>>

<%} %>



</body>
</html>