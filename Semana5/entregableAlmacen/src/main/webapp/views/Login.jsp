<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Acceso - Usuario</title>
<link rel="stylesheet" href="../styles/stylesLogin.css">
</head>
<body>

 <div class="login-container">
        <h2>Iniciar sesi�n</h2>
        <form action="/entregableAlmacen/LoginServlet" method="post">
            <input type="text" name="usuario" placeholder="Usuario"><br>
            <input type="password" name="contrasena" placeholder="Contrase�a" required><br>
            <input type="submit" value="Iniciar sesi�n">
        </form>
    </div>

</body>
</html>