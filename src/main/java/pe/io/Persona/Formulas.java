package pe.io.Persona; 

public class Formulas{
    
    //Convertimos todas las variables a float:
    private float capital;
    private float tasa;
    private float nPeriodos;

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

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(int tasa) {
        this.tasa = tasa;
    }

    public float getnPeriodos() {
        return nPeriodos;
    }

    public void setnPeriodos(int nPeriodos) {
        this.nPeriodos = nPeriodos;
    }
    
    
    //Creamos un método toString(): Temporal:

    @Override
    public String toString() {
        return "Formulas{" + "capital=" + capital + ", tasa=" + tasa + ", nPeriodos=" + nPeriodos + '}';
    }
    
}
