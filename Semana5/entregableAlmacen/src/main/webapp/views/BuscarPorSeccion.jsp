<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Busqueda Seccion</title>
<link rel="stylesheet" href="../styles/stylesBusquedaPorSeccion.css">
</head>
<body>


<div class="container">
<h2>Busqueda Producto por Seccion</h2>
<form action="/entregableAlmacen/BuscarSeccionServlet" method="post">
    
        <label for="seccion">Sección:</label><br>
        <select id="seccion" name="seccion">
            <option value="INFORMATICA">INFORMATICA</option>
            <option value="LIMPIEZA">LIMPIEZA</option>
            <option value="COMIDA">COMIDA</option>
            <option value="CONSTRUCCION">CONSTRUCCION</option>
        </select><br><br>

        <input type="submit" value="Buscar Producto">
    </form>
</div>
</body>
</html>