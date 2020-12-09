package EksamensOpgaver.Strenge;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
Main main = new Main();
String resultat = main.fireVærdier("mathias", "markus", 'm','s');
        System.out.println(resultat);
    }
//fireVærdier ("mathias", "markus", 'm','s');
    public String fireVærdier (String ord1, String ord2, char tegn1, char tegn2) throws IllegalAccessException {
        //mathias markus (m,s) = sathiassarkus
        //fejlhåndtering
        if (ord1.length() < 1 || ord2.length() < 1){
            throw new IllegalAccessException("du glemte at skrive noget");
        }

        String retVal = ord1 + ord2;
        String retVal1 = retVal.replace(tegn1,tegn2);



return retVal1;
    }
}
