package pe.io.Persona; 

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Formulas{
    
    //Convertimos todas las variables a float:
    private float capital;
    private float tasa;
    private float nPeriodos;
    //Agregamos valores para las anualidades:
    private float pagoAnualidad;
    
    public Formulas(){
        
    }
    
    //Con esto se puede ya hacer objetos variable:
    public Formulas(float capital, float tasa, float nPeriodos) {
        this.capital = capital;
        this.tasa = tasa;
        this.nPeriodos = nPeriodos;
    }

    //Creamos los métodos Getters and Setters():
    //Simplemente coloqué un comentario desde el mismo GitHub (ingorar).
    public float getCapital() {
        return capital;
    }

    public void setCapital(float capital) {
        this.capital = capital;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public float getnPeriodos() {
        return nPeriodos;
    }

    public void setnPeriodos(float nPeriodos) {
        this.nPeriodos = nPeriodos;
    }

    public float getPagoAnualidad() {
        return pagoAnualidad;
    }

    public void setPagoAnualidad(float pagoAnualidad) {
        this.pagoAnualidad = pagoAnualidad;
    }
    //Creamos un método toString(): Temporal:

    @Override
    public String toString() {
        return "Formulas{" + "capital=" + capital + ", tasa=" + tasa + ", nPeriodos=" + nPeriodos + '}';
    }
    
    //Este toString es para la anualidad, (ojo aquí no hay capital):
    public String toString(String a){
        return "Formulas{" + "capital=" + capital + ", tasa=" + tasa + ", nPeriodos=" + nPeriodos + ", pagoAnualidad = "+pagoAnualidad+'}';
    }
    
}
