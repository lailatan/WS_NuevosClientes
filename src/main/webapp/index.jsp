<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nuevo Cliente</title>
</head>
<body style="background-color: lavender; padding: 10px;">
    <h1>Formulario para crear nuevos Clientes</h1>
    <br/>
    <form action="hello-servlet" method="post">
        <input type="text" placeholder="Usuario" name="usuario">
        <br/>
        <input type="password" placeholder="Password" name="password">
        <br/>
        <button type="submit">Enviar</button>
        <br/>
        <a href="hello-servlet">Hello Servlet</a>
    </form>
</body>
</html>