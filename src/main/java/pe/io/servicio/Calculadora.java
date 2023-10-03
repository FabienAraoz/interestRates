package pe.io.servicio; 

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import pe.io.Persona.Formulas;


@Named
@RequestScoped
public class Calculadora{
    
    /*
        Tenemos que reestructurar toda la clase para realizar la ejecución del  Bean en JSF:
    */
    
    @Inject
    private Formulas formulas;
    
    public Calculadora(){
    }
    
    //setter para la clase Formula:
    public void setFormulas(Formulas newFormula){
        this.formulas = newFormula;
    }
    
    /*
        Creamos el método para poder redirigir la página y calculamos el interés:
    */

    public String enviar(){
        if((this.formulas.getCapital())>100.00){
            if(this.formulas.getTasa()>2.5){
            //Vamos a textear con un texto plano:
            String msg = "Es correcto, tienes más de 100 pavos de capital:";
            FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR,msg, msg);
            FacesContext facesContext = FacesContext.getCurrentInstance();
            String componendId = null;
            facesContext.addMessage(componendId, facesMessage);
            }
            return "index";
        }else{
            //Ok se sesupone que con esto debería funcionar
            return "index";
        }
    }
    
    /*
        Creamos el método para las anualidades:
    */
    public String enviarAnualidades(){
        if(this.formulas.getPagoAnualidad()>10){
            if(this.formulas.getTasa()>1.0){
                String msg = "Tienes capital aceptable, en tasa!";
                        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, msg, msg);
                        FacesContext facesContext = FacesContext.getCurrentInstance();
                        String componendId = null;
                        facesContext.addMessage(componendId, facesMessage);
            }
            return "anualidades";
        }
        return "anualidades";
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
    
    //Este es el método para generar anualidades ordinarias:
    public float anualidad_ordinaria(Formulas claseBean){
        float monto;
        monto = (float)(claseBean.getPagoAnualidad()*(((Math.pow((1+(claseBean.getTasa()/100)),claseBean.getnPeriodos()))-1))/(claseBean.getTasa()/100));
        return monto;
    }
    
    //retornar valores del Objeto:
    public String retonarObjecto(Formulas claseBean){
        return claseBean.toString();
    }
} 
