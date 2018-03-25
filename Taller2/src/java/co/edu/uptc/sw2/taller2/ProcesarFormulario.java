/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.taller2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author acwin7ra-01
 */
@WebServlet(name = "ProcesarFormulario", urlPatterns = {"/ProcesarFormulario"})
public class ProcesarFormulario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("------------------------");
        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Prueba</title>");
            out.println("</head>");
            out.println("<body>");

            String usuario = req.getParameter("usuario");
            String contrasena = req.getParameter("contrasena");

            String usuario2 = "nombreUsuario";
            String contrasena2 = "a123";
            
            if (usuario.equals(usuario2) && contrasena.equals(contrasena2)) {
                out.println("Bienvenido, " + usuario);
                out.println("</body>");
                out.println("</html>");
                req.setAttribute(usuario, out);
                req.setAttribute(contrasena, out);
            }else{
                out.println("Usuario o contraseña inválida");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
}
