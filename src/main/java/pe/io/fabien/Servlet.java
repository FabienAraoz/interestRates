package pe.io.fabien;

import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/procesador")
public class Servlet extends HttpServlet{
    //Sobreescribimos el método doPost(): porque segun la IA es excelente para responder.
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        String casilla1 = request.getParameter("unidad_1");
        String casilla2 = request.getParameter("unidad_2");
        String casilla3 = request.getParameter("unidad_3");
        
        //Vamos a procesar los datos con el código extraido del siguiente formulario:
        
    }
}