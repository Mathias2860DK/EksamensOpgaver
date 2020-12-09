package EksamensOpgaver.Strenge.Regning;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Instantierer Main klassen, så jeg kan bruge dens metoder i main metoden
Main main  = new Main();
//variabler jeg bruger
int choice1 = 0;
int choice2 = 0;
Scanner scanner = new Scanner(System.in);

//fanger brugerns input
        System.out.println("Vælg 2 tal der skal pluses, minuses, divideres og ganges (indenfor 1-50)");
choice1 = scanner.nextInt();
        System.out.println("Vælg det andet tal som skal pluses/minuses/divideres og ganges med: ");
choice2 = scanner.nextInt();
//metodekald med brugerens input
main.udregning(choice1,choice2);
    }

    public void udregning (int tal1, int tal2) {
int sum = 0;
//validering af om talene er mellem 1 og 50
            if (tal1 <= 50 && tal2 <= 50 && tal1 > 0 && tal2 > 0) {
                sum = tal1 +tal2;
                System.out.println("Plus resultat: " + sum );
                sum = tal1-tal2;
                System.out.println("Minus resultat: " + sum );
                sum = tal1*tal2;
                System.out.println("Gange resultat: " + sum );
                sum = tal1 / tal2;
                System.out.println("Dividere resultat: " + sum);
            } else {
throw new IllegalArgumentException((Integer.toString(tal1,tal2)));
            }

    }
}
