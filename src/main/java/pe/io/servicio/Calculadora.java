package pe.io.servicio; 

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import pe.io.Persona.Formulas;


@Named
@RequestScoped
@ManagedBean
public class Calculadora{
    
    /*
        Tenemos que reestructurar toda la clase para realizar la ejecución del  Bean en JSF:
    */
    
    @Inject
    private Formulas formula;
    
    public Calculadora(){
    }
    
    //setter para la clase Formula:
    public void setFormula(Formulas newFormula){
        this.formula = newFormula;
    }
    
    /*
        Creamos el método para poder redirigir la página y calculamos el interés:
    */

    public String enviar(){
        if((this.formula.getCapital())>100.00){
            //Vamos a textear con un texto plano:
            String msg = "Es correcto, tienes más de 100 pavos de capital:";
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg, msg);
            FacesContext facesContext = FacesContext.getCurrentInstance();
            String componendId = null;
            facesContext.addMessage(componendId, facesMessage);
            return "exito";
        }else{
            //Ok se sesupone que con esto debería funcionar
            return "fracaso";
        }
    }
    
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
        monto = (float) ( claseBean.getCapital() * (Math.pow((1+(claseBean.getTasa()/100)),claseBean.getnPeriodos())));
        return monto;
    }
    
    //retornar valores del Objeto:
    public String retonarObjecto(Formulas claseBean){
        return claseBean.toString();
    }
} 
