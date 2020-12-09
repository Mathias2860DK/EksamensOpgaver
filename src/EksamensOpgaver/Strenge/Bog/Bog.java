package EksamensOpgaver.Strenge.Bog;

public class Bog {

    String ISBNnummer;
    String titel;
    int udgivelsesAar;

    public Bog(String ISBNnummer, String titel, int udgivelsesAar){
        this.ISBNnummer = ISBNnummer;
        this.titel = titel;
        this.udgivelsesAar = udgivelsesAar;
    }
    public String getISBNnummer(){
        return ISBNnummer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesAar(){
        return udgivelsesAar;
    }
    public void setISBNnummer (String ISBNnummer){
        this.ISBNnummer = ISBNnummer;
    }

    public void setUdgivelsesAar(int udgivelsesAar) {
        this.udgivelsesAar = udgivelsesAar;
    }
    public void setTitel(){
        this.titel = titel;
    }

    @Override
    public String toString() {
        return "EksamensOpgaver.Strenge.Bog{" +
                "ISBNnummer=" + ISBNnummer +
                ", titel='" + titel + '\'' +
                ", udgivelsesAar=" + udgivelsesAar +
                '}';
    }
}
