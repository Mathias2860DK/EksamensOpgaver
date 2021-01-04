package Bil2;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    String name;
    List<Bil> garage = new ArrayList<>();

    public void addBil(Bil bil) {
        garage.add(bil);
    }

    public void printAllMiljøSvin() {
        System.out.println("Disse biler i garagen er nogle miljøsvin: ");
        for (Bil bil : garage) {
            if (bil.miljøTryk() > 250) {
                System.out.print(bil);
            }
        }
    }
}
