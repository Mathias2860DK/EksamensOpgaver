package EksamensOpgaver.Strenge.PropperCase;



import java.util.Scanner;

public class Main {
    //Lidt sjov opgave
    Scanner scanner;
    public static void main(String[] args) {
Main main = new Main();
//main.upperLowerCase();
String resultat = main.upperLowerCase();
        System.out.println(resultat);

    }

    public String upperLowerCase(){
        scanner = new Scanner(System.in);
        String input = "";
        //regl1:Ord,som udelukkendeer skrevet medstore bogstaver,skal ikke ændres.
        //regl2:Ord på mere end 3 bogstaver skal skrives med småt, dog med stortbegyndelsesbogstav
        //regl3:Ord på max.3 bogstaver skal skrives med småt.
        System.out.println("Skriv en sætning og vi formatere den for dig (med vores regler)");
input = scanner.nextLine();
        for (int i=0; i<input.length(); i++)
        {
            //Hivs input er 3 eller mindre lang bliver alle tegn til lowercase
            if (input.length() <= 3){
                String result = input.toLowerCase();
                return result;
            }
//Hvis alle bogstaver er skrevet med stort skal der ikke ændres noget
            if (!Character.isUpperCase(input.charAt(i)))
            {
                //hvis input længden er over 3 skal der stort begyndelses bogstav (input.charAt(0))
                if (input.length() > 3){
                    char c = input.charAt(0);
                    char c1 = Character.toUpperCase(c);
                    //input.replace erstatter det gamle input (c) med det nye input (c1) som er blevet formateret
                    //til upper case.
                    String result = input.replace(c,c1);
                    //Character.toUpperCase(input.charAt(0));
                    return result;
                }
            }else {
                return input;
            }
        }
        return input;
    }
}
