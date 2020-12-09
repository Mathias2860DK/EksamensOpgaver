package EksamensOpgaver.Strenge.Menu;

import java.util.Scanner;

public class MetoderTilMenu {
    //instantierer scanner objekt.
    Scanner scanner = new Scanner(System.in);

    public int plusToTal (){
        //instantierer variable vi skal bruge.
        int sum = 0;
        int tal1 = 0;
        int tal2 = 0;
        //fanger brugerens svar i et scanner objekt og bruger de inputs til en udregning
        System.out.println("Indtast første man vil pluse");
        tal1 = scanner.nextInt();
        System.out.println("Indsæt det andet til du vil pluse med det forrige tal");
        tal2 = scanner.nextInt();

        sum = tal1+tal2;

        return sum;
    }

    public void udskrivResultat(int resultat){
        //Resultatet fra metoden plusToTal() bliver fanget i en int og bliver smidt med som
        //argument her og summen udprintes.
        System.out.println("Resultatet for de 2 plusede tal er: " + resultat);
    }

    public void hjælp(){
        //Eller søg på nettet :)
        System.out.println("eks. 3 bananer + 3 bananer = 6 bananer");
    }
}
