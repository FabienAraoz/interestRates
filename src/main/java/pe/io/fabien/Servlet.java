package pe.io.fabien;

import pe.io.running.Formulas;
import pe.io.servicio.Calculadora;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/procesador")
public class Servlet extends HttpServlet{
    //Sobreescribimos el método doPost(): porque segun la IA es excelente para responder.
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        //Ceramos un Objeto prueba:
        Formulas objetoUsuario = new Formulas();
        
        objetoUsuario.setCapital(Integer.parseInt(request.getParameter("userCapital")));
        objetoUsuario.setTasa(Integer.parseInt(request.getParameter("userInterest")));
        objetoUsuario.setnPeriodos(Integer.parseInt(request.getParameter("userTimes")));
        
        //Damos a ejecutar el método de interes Simple:
        Calculadora test = new Calculadora();
        test.interes_simple(objetoUsuario);
        
    }
}