package modelo;

public class Calculador {

    private double numeroA;
    private double numeroB;

    public Calculador() {
        this(0, 0);
    }

    public Calculador(double numeroA, double numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public double getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(double numeroA) {
        this.numeroA = numeroA;
    }

    public double getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(double numeroB) {
        this.numeroB = numeroB;
    }

    public double getSoma(){
        return getNumeroA() + getNumeroB();
    }

    public double getDiferenca() {
        return getNumeroA() - getNumeroB();
    }

    public double getProduto() {
        return getNumeroA() * getNumeroB();
    }

    public double getRazao() {
        return getNumeroA() / getNumeroB();
    }
   
}
