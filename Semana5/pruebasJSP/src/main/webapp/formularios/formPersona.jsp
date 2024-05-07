<%@page import="com.pruebas.Persona"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Persona</title>
<link rel="stylesheet" href="../styles/estilosFormPersona.css">
</head>
<body>

<!-- Vista HTML -->
    <form action="ProcesarDatosPersona.jsp" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="edad">Edad:</label>
        <input type="number" id="edad" name="edad" required><br><br>
        
        <label for="direccion">Dirección:</label>
        <input type="text" id="direccion" name="direccion"><br><br>
        
        <label for="telefono">Teléfono:</label>
        <input type="text" id="telefono" name="telefono"><br><br>
        
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br><br>
        
        <input type="submit" value="Enviar">
    </form>


<%
//Logica JSP
	String nombre = request.getParameter("nombre");
	//int edad = Integer.parseInt(request.getParameter("edad"));
	String direccion = request.getParameter("direccion");
	String telefono = request.getParameter("telefono");
	String email = request.getParameter("email");
	
	Persona camilo = new Persona(nombre, 10, direccion, telefono, email);
	
	%>
	<h3>Mostramos persona</h3>

	<%= camilo.toString() %>

</body>
</html>