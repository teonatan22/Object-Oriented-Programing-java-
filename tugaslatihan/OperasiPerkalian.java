package pbo.tugaslatihan;

public class OperasiPerkalian extends OperasiBilangan {
    protected double a, b, c;
    protected void setA(double a) {
        this.a = a;
    }

    protected double getA() {
        return a;
    }

    // Metode setter dan getter untuk variabel b
    protected void setB(double b) {
        this.b = b;
    }

    protected double getB() {
        return b;
    }

    protected void setC(){
        c = a*b;
    }
    protected double getC(){
        return c;
    }
    protected void tampil(){
        System.out.println(" hasil dari "+ getA()+ " * " + getB() +"="+getC());
    }
}
