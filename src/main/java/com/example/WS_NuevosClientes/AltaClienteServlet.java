package com.example.WS_NuevosClientes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AltaClienteServlet", value = "/AltaClienteServlet")
public class AltaClienteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:"+ "orange" +";'>");
        out.println("<h1> Acceso denegado. Ingrese x el formulario !!!!</h1>");
        out.println("</body></html>");
        //response.sendRedirect("Error.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String cargo = request.getParameter("cargo");
        String empresa = request.getParameter("empresa");
        String telefono = request.getParameter("telefono");
        String mail = request.getParameter("mail");

        Cliente cliente = new Cliente(nombre,cargo,empresa,telefono,mail);
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color:"+ "yellow" +";'>");
        out.println("<h1> Cliente JSON:</h1>");
        out.println("<h2> " + cliente + "</h1>");
        out.println("</body></html>");

    }
}
