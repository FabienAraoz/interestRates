package pe.io.servicio; 

import pe.io.Persona.Formulas;

public class Calculadora{
    
    //Creamos una clase para ejecutar los métodos:
    
    //Vamos a crear los métodos de interes con un método sencillo:
    public float interes_simple(Formulas claseBean){
        float monto;
        monto = (claseBean.getCapital() * (1+((claseBean.getTasa()/100)*claseBean.getnPeriodos())));
        return monto;
    }
    
    //Esta es la función para el monto de interés compuesto: (cambiamos a float)
    public float interes_compuesto(Formulas claseBean){
        float monto;
        //Hacemos un cast en Float:
        monto = (float) ( claseBean.getCapital() * ((1+(claseBean.getTasa()/100))*Math.exp(claseBean.getnPeriodos())));
        return monto;
    }
    
    //retornar valores del Objeto:
    public String retonarObjecto(Formulas claseBean){
        return claseBean.toString();
    }
} 
