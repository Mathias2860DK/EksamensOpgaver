package Biler;

import java.util.ArrayList;
import java.util.List;

public class Garage {
String name;
List <Bil> bilList = new ArrayList<>();

public void addCarsToGarage(Bil bil){
    bilList.add(bil);
}

public void printGarage(){
    for (Bil bil : bilList){
        System.out.println(bil);
    }

}

public void printAllMiljøSvin(){
    System.out.println("Disse biler i garagen er nogle miljøsvin: ");
    for (Bil bil : bilList){
        if (bil.horsePower > 250){
            System.out.print(bil);
        }
    }

}

}
