package EksamensOpgaver.Strenge.Græs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //laver instans af main klassen, for at kalde en non static metode i main metoden (som er static)
        Main main = new Main();
        //Variabler vi skal bruge
        Scanner scanner = new Scanner(System.in);
        double howHighIsYourGrass = 0;
        double whenToCutGrass = 0;
        System.out.println("Græsset skal overstige denne værdi,før vi starter græsslåmaskinen");
        System.out.println("Hvor højt er dit græs nu?");
        //fanger brugerns input i en double for at smide det med som parameter i metoden nedenfor.
        howHighIsYourGrass = scanner.nextDouble();
        System.out.println("Hvor langt må dit græs være før det bliver slået?");
        whenToCutGrass = scanner.nextDouble();
        System.out.println("Du skal slå græs om: " +
                main.whenToCutGrass(howHighIsYourGrass,whenToCutGrass) + " dage.");

    }
    public int whenToCutGrass (double heightNow, double heightToCut){
        // heightNow = 1 cm
        // heightToCut = 9 cm
        // heightNow = 4,5 cm
        // heightToCut = 10 cm 6,875

        int daysToCut = 0;
        double growCmPerDay = 0.8;
        //mens er den nuværende højde er under den ønskede højde +1 på daysToCut
while (heightNow <  heightToCut){
    //hver gang en dag passerer +'er vi med growCmPerDay
    heightNow += growCmPerDay;
    //ligger en dag til hvis expression stadig ikke er rigtig
    daysToCut++;

}
        return daysToCut;
    }
}
