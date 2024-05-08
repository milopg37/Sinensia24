<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Eliminar Producto</title>
<link rel="stylesheet" href="../styles/stylesEliminarProducto.css">
</head>
<body>

	 <div class="container">
        <h2>Eliminar Producto</h2>
        <form action="/entregableAlmacen/EliminarProductoServlet" method="post">
            <label for="nombreProducto">Ingrese nombre de producto a eliminar:</label>
            <input type="text" id="nombreProducto" name="nombreProducto" placeholder="Nombre del producto" required>
            <input type="submit" value="Eliminar">
        </form>
    </div>

</body>
</html>