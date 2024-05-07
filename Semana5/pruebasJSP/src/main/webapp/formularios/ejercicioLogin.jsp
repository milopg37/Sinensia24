<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio Login</title>
<link rel="stylesheet" href="../styles/estilosLogin.css">
</head>
<body>

<!-- Vista HTML Form Login -->
<div class="login-container">
    <h2>Iniciar Sesión</h2>
    <form action="#" method="post">
        <input type="text" name="usuario" placeholder="Usuario" required>
        <input type="password" name="contrasena" placeholder="Contraseña" required>
        <input type="submit" value="Iniciar Sesión">
    </form>
</div>

<%
//Ejercicio Simplificado del que realizmos con Servlets, pero esta vez usando JSP
	if("POST".equalsIgnoreCase(request.getMethod())){
		
		String user = request.getParameter("usuario");
		String passwd = request.getParameter("contrasena");
		String passwdCorrecta = "pepito";
		
		if(passwd.equalsIgnoreCase(passwdCorrecta)){
			%> <h2>Logeado Correctamente</h2>

<%		}else{
			%>	<h2>Contraseña incorrecta</h2>
<% }
		
	}

%>
</body>
</html>