package EksamensOpgaver.Strenge.Sortering;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
Scanner scanner;

    public static void main(String[] args) {
        Main main = new Main();
        String[] resultat = main.fiveStrings();
        main.sortArray(resultat);
    }

    public String[] fiveStrings (){
        String [] retVal = new String[5];

for (int i = 0; i < retVal.length; i++){
    scanner = new Scanner(System.in);
    System.out.println("Skriv et ord: ");
 retVal[i] = scanner.nextLine();
}
        return retVal;
    }

    public void sortArray (String[] fiveStrings){
        System.out.println("før det er sorted alfabetisk: " + Arrays.toString(fiveStrings));
        Arrays.sort(fiveStrings);
        System.out.println("Efter sortering: " + Arrays.toString(fiveStrings));
    }
}
