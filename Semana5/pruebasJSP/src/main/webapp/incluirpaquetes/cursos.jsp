<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cursos</title>
</head>
<body>

	<%
	String curso = "chino";
	String curso2 = "japones";
	String curso3 = "esperanto";
	List<String> listaCursos = new ArrayList<>();
	listaCursos.add(curso);
	listaCursos.add(curso2);
	listaCursos.add(curso3);
	%>
	
	<h2>Los cursos usando parrafos</h2>
	
		<p>Primer curso: <%= listaCursos.get(0)  %> </p>
		<p>Segundo curso: <%= listaCursos.get(1)  %> </p>
		<p>Tercer curso: <%= listaCursos.get(2)  %> </p>
	
	<h2>Los cursos usando tabla de 1 fila</h2>
	
	<table border="1">
		<tr>
			<th>Primer curso: <%= listaCursos.get(0) %></th>
			<th>Segundo curso: <%= listaCursos.get(1) %></th>
			<th>Tercer curso: <%= listaCursos.get(2) %></th>
		</tr>
	</table>
	
	<h2>Los cursos usando tabla de 1 columna</h2>
	
	<table border="1">
		<tr>
			<td>Primer curso: <%= listaCursos.get(0) %></td>
		</tr>
		<tr>
			<td>Segundo curso: <%= listaCursos.get(1) %></td>
		</tr>
		<tr>
			<td>Tercer curso: <%= listaCursos.get(2) %></td>
		</tr>
	</table>
	
	<h2>Los cursos usando una lista</h2>
	
	<ul>
		<li>Primer curso: <%= listaCursos.get(0) %></li>
		<li>Segundo curso: <%= listaCursos.get(1) %></li>
		<li>Tercer curso: <%= listaCursos.get(2) %></li>
	</ul>

</body>
</html>