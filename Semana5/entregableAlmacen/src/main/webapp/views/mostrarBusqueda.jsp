<%@page import="com.curso.models.Producto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Busqueda</title>
<link rel="stylesheet" href="../styles/stylesMostrarBusqueda.css">
</head>
<body>

	<div class="container">
		<h2>Resultados de Búsqueda por Sección</h2>
		<p>A continuación se muestran los resultados para la sección seleccionada:</p>
		<ul>

			<%
			List<Producto> lista = (List<Producto>) session.getAttribute("listaProductos");
			%>

			<%
			for (Producto prod : lista) {
			%>
			<li><%=prod.toString()%></li>

			<%
			}
			%>

		</ul>
	</div>

</body>
</html>