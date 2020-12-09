package EksamensOpgaver.Strenge.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
ArrayList<String> strings = new ArrayList<>();


    }
    public void stringArray (ArrayList<String> strings, String string){
        if (Arrays.asList(strings).contains(string)){
            System.out.println("Dette element er allerede i arrayet.");
        } else {
            strings.add(string);
        }


    }

      /*  public boolean isDuplicate () {
            if (Arrays.asList(strings).contains(string)) {
                System.out.println("Dette element er allerede i arrayet.");

                return false;
            }

        }*/
}
