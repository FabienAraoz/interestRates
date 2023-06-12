package pe.io.running; 

public class Formulas{
    
    //Declaramos las variables para el interés simple o compuesto:
    private int capital;
    private int tasa;
    private int nPeriodos;

    public Formulas(){
        
    }
    
    //Con esto se puede ya hacer objetos variable:
    public Formulas(int capital, int tasa, int nPeriodos) {
        this.capital = capital;
        this.tasa = tasa;
        this.nPeriodos = nPeriodos;
    }

    //Creamos los métodos Getters and Setters():

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public int getTasa() {
        return tasa;
    }

    public void setTasa(int tasa) {
        this.tasa = tasa;
    }

    public int getnPeriodos() {
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
