package Supermarket;

public class Vare {
    String navn;
    double pris;
    int simpelStregKode;

    public Vare (String navn, double pris, int simpelStregKode){
        this.navn = navn;
        this.pris = pris;
        this.simpelStregKode = simpelStregKode;
    }

    public double getPris(){
        return this.pris;
    }

    public void setPris(int pris){
        this.pris = pris;
    }

    public String toString (){
        return navn + "........."
                + pris + "\n";
    }
}
