<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acceso - Usuario</title>
<link rel="stylesheet" href="../styles/stylesLogin.css">
</head>
<body>

 <div class="login-container">
        <h2>Iniciar sesión</h2>
        <form action="/entregableAlmacen/LoginServlet" method="post">
            <input type="text" name="usuario" placeholder="Usuario"><br>
            <input type="password" name="contrasena" placeholder="Contraseña" required><br>
            <input type="submit" value="Iniciar sesión">
        </form>
    </div>

</body>
</html>