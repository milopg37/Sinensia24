<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ejemplos Select</title>
</head>
<body>

<form action="#" method="POST">
	<input type="text" name="dato">
	<button type="submit">Redirigir</button>
</form>


<%
	if("POST".equalsIgnoreCase(request.getMethod())){
		
		%>	<h2>Printeo lista dentro del bucle</h2>
		
		<%
			String texto = request.getParameter("dato");
		%>
		
			<form>
				<select>
					<% for(int i = 0; i < 5; i++){ %>
						
						<option value="<%= texto %>"> <%= texto %> </option>
						
					<% } %>
					
				</select>
			</form>
		
	<% } %>
	
	
</body>
</html>