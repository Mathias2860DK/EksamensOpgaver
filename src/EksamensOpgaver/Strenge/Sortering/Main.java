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
        Arrays.sort(fiveStrings);
        System.out.println(Arrays.toString(fiveStrings));
    }
}
