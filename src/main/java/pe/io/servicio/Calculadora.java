package pe.io.servicio; 

import pe.io.running.Formulas;

public class Calculadora{
    
    //Creamos una clase para ejecutar los métodos:
    
    //Vamos a crear los métodos de interes con un método sencillo:
    public int interes_simple(Formulas claseBean){
        //Esta es la fórmula en cuestión:
        int monto;
        monto = claseBean.getCapital() * claseBean.getnPeriodos() * claseBean.getTasa();
        return monto;
    }
    
    //Esta es la función para el monto de interés compuesto:
    public int interes_compuesto(Formulas claseBean){
        int monto;
        //Hacemos (casting) por [Conversión explícita]:
        monto =(int) ((int) claseBean.getCapital() * ((1+claseBean.getTasa())*Math.exp(claseBean.getnPeriodos())));
        return monto;
    }
    
    //retornar valores del Objeto:
    public String retonarObjecto(Formulas claseBean){
        return claseBean.toString();
    }
} 
