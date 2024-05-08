<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Modificar Precio</title>
<link rel="stylesheet" href="../styles/stylesModificarPrecio.css">
</head>
<body>

	<div class="container">
        <h2>Establecer Nuevo Precio</h2>
        <form action="/entregableAlmacen/ModificarPrecioServlet" method="post">
        	<label for="nuevoPrecio">Ingrese el nombre del producto a modificar precio:</label>
            <input type="text" id="nombreProducto" name="nombreProducto" placeholder="Nombre Producto" required>
            
            <label for="nuevoPrecio">Ingrese el nuevo precio del producto:</label>
            <input type="text" id="nuevoPrecio" name="nuevoPrecio" placeholder="Nuevo precio" required>
            
            <input type="submit" value="Establecer Precio">
        </form>
    </div>

</body>
</html>