<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Producto</title>
<link rel="stylesheet" href="../styles/stylesAgregarProducto.css">
</head>
<body>

	 <h2>Agregar Nuevo Producto</h2><br>
    <form action="/entregableAlmacen/AgregarProductoServlet" method="post">
    
        <label for="nombre">Producto:</label><br>
        <input type="text" id="nombre" name="nombre" required><br><br>
        
        <label for="seccion">Sección:</label><br>
        <select id="seccion" name="seccion">
            <option value="INFORMATICA">INFORMATICA</option>
            <option value="LIMPIEZA">LIMPIEZA</option>
            <option value="COMIDA">COMIDA</option>
            <option value="CONSTRUCCION">CONSTRUCCION</option>
        </select><br><br>

        <label for="precio">Precio:</label><br>
        <input type="number" id="precio" name="precio" min="0" step="0.01" required><br><br>


        <label for="stock">Stock:</label><br>
        <input type="number" id="stock" name="stock" min="0" required><br><br>

        <input type="submit" value="Agregar Producto">
    </form>

</body>
</html>