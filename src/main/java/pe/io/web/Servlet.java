package pe.io.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import pe.io.Persona.Formulas;
import pe.io.servicio.Calculadora;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/procesador")
public class Servlet extends HttpServlet {

    //Sobreescribimos el método doPost(): porque segun la IA es excelente para responder.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //Ceramos un Objeto prueba:
        Formulas objetoUsuario = new Formulas();

        objetoUsuario.setCapital(Float.parseFloat(request.getParameter("userCapital")));
        objetoUsuario.setTasa(Float.parseFloat(request.getParameter("userInterest")));
        objetoUsuario.setnPeriodos(Float.parseFloat(request.getParameter("userTimes")));

        //Damos a ejecutar el método de interes Simple:
        Calculadora test = new Calculadora();
        float resultado;
        resultado =test.interes_simple(objetoUsuario);

        //Reenviamos el formulario a un nuevo HTML [sin jsp]:
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Resultado: " + resultado + "</h1>");
        out.println("<p>Espero lo disfrutes.... felicidades: <p>");
        out.println("</body>");
        out.println("</html>");
        //esta doc nos podría interesar: https://documentacion.fundacionmapfre.org/documentacion/publico/en/bib/23118.do?format=mods
    }
}
