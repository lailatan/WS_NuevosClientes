<%--
  Created by IntelliJ IDEA.
  User: laila
  Date: 18/5/2021
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
      <title>Alta Cliente</title>
      <style>
        body{background-color: burlywood;padding: 25px;}
        input{margin:3px;}
        form{padding:10px;border:1px solid black;width:fit-content;}
      </style></head>
  <body style="background-color: lavender; padding: 10px;">
    <h1>Formulario para crear nuevos Clientes</h1>
    <br/>
    <p>Complete el siguiente formulario para registrar un nuevo cliente. Los campos marcados con un asterisco <span style="color:red">*</span> son obligatorios.</p>
    <form action="AltaClienteServlet" method="post">
        <br/>
        <input type="text" required name="nombre" placeholder="Nombre"> <span style="color:red">*</span><br />
        <br />
        <input type="text" required name="cargo" placeholder="Cargo"> <span style="color:red">*</span><br />
        <br />
        <input type="text" required name="empresa" placeholder="Empresa SA"> <span style="color:red">*</span><br />
        <br />
        <input type="phone" name="telefono" placeholder="+54 11 1111 1111"><br />
        <br />
        <input type="email" placeholder="Mail" name="mail">
        <br/>
        <button type="submit">Enviar</button>
        <br/>
        <br/>
    </form>
  </body>
</html>
