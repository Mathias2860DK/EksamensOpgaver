package EksamensOpgaver.Strenge.Menu;

import java.util.Scanner;

public class MainController {
    //Instaniserer PrintMenu og MetoderTilMenu klassen for at kunne tilgå deres metoder.
    PrintMenu printMenu = new PrintMenu();
    MetoderTilMenu metoderTilMenu = new MetoderTilMenu();

    //Variable vi bruger:
    Scanner scanner;
    int choice = 0;
    int exitValue = 9;
    int resultat = 0;
    public void runProgram(){

        scanner = new Scanner(System.in);
        //hovedloppet kører indtil choice er forskel fra exitValue(9)
        while (choice != exitValue){
            //Printer menuen, hver gang vi kommer ud af en metode
            printMenu.printMenu();
            //fanger brugens input i et scanner objekt, som fortæller hvilken metoden der skal tilgås i switch-casen
            choice = scanner.nextInt();
            switch (choice){
                case 1: resultat = metoderTilMenu.plusToTal();
                    break;
                case 2 : metoderTilMenu.udskrivResultat(resultat);
                    break;
                case 3: metoderTilMenu.hjælp();
                    break;



            }

        }

    }




}
