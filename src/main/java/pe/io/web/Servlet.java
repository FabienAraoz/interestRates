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

        Calculadora test = new Calculadora();
        float resultado = 0;
        String valorBoton = request.getParameter("calcular");
        //Realizamos la condicional para el interés simple y compuesto:

        if("interesSimple".equals(valorBoton)){
            resultado =test.interes_simple(objetoUsuario);            
        }
        else if("interesCompuesto".equals(valorBoton)){
            resultado = test.interes_compuesto(objetoUsuario);            
        }
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
