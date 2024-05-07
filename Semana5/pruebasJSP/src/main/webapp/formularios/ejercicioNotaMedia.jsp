<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejercicio Nota Media</title>
<link rel="stylesheet" href="../styles/estilosNotaMedia.css">
</head>
<body>

<!-- Vista HTML del form -->
<div class="form-container">
    <h2>Registro de Notas</h2>
    <form action="#" method="post">
        <label for="asignatura1">Asignatura 1</label>
        <input type="number" id="asignatura1" name="asignatura1" placeholder="Ingrese la nota" min="0" max="10" step="0.1" required>

        <label for="asignatura2">Asignatura 2</label>
        <input type="number" id="asignatura2" name="asignatura2" placeholder="Ingrese la nota" min="0" max="10" step="0.1" required>

        <label for="asignatura3">Asignatura 3</label>
        <input type="number" id="asignatura3" name="asignatura3" placeholder="Ingrese la nota" min="0" max="10" step="0.1" required>

        <input type="submit" value="Sacar Media">
    </form>
</div>

<%
//Logica JSP
	if("POST".equalsIgnoreCase(request.getMethod())){
	
		//Paseo, creo lista y las añado
		String nota1 = request.getParameter("asignatura1");
		String nota2 = request.getParameter("asignatura2");
		String nota3 = request.getParameter("asignatura3");
		
		int notaParseada1 = Integer.parseInt(nota1);
		int notaParseada2 = Integer.parseInt(nota2);
		int notaParseada3 = Integer.parseInt(nota3);
		
		List<Integer> notas = new ArrayList<>();
		notas.add(notaParseada1);
		notas.add(notaParseada2);
		notas.add(notaParseada3);
		
		int total = 0;
		int numNotas = 0;
		for (Integer nota : notas) { 
	    	total += nota;
	    	numNotas++;
	    
	     }
	     int media = total / numNotas;
	%>
		<h2>Media: <%=media %></h2>
		
<% 	}

%>

</body>
</html>