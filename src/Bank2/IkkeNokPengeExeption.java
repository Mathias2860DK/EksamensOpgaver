package Bank2;

public class IkkeNokPengeExeption extends Exception {

public IkkeNokPengeExeption (String message){
    super(message);
}
/*
Hvis man feks. har en SQL Exeption kan man smide den med.
    public IkkeNokPengeExeption (String message, Throwable cause){
        super(message,cause);
    }

 */
}
