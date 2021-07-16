package com.example.WS_NuevosClientes;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
/*
        String ciudad = request.getParameter("ciudad");
        Integer temperatura = Integer.parseInt(request.getParameter("temperatura"));
        String clima = request.getParameter("clima");
        String color="";
        // Hello
        switch (clima){
            case "nublado" -> color="gray";
            case "ventoso" -> color="cyan";
            case "soleado" -> color="yellow";
            case "lluvia" -> color="blueviolet";
            case "tormenta" -> color="blue";
            case "nieve" -> color="white";
        }
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:"+ color +";'>");
        out.println("<h1> Hola " + ciudad + " !!!!</h1>");
        out.println("<h2> Hoy será un día de " + temperatura + " ° y " + clima + " !!!!</h1>");
        out.println("</body></html>");
  */
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:"+ "orange" +";'>");
        out.println("<h1> Acceso denegado. Ingrese x el formulario !!!!</h1>");
        out.println("</body></html>");

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String pass = request.getParameter("password");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:"+ "yellow" +";'>");
        out.println("<h1> Hola " + usuario + " !!!!</h1>");
        out.println("</body></html>");

    }

    public void destroy() {
    }
}