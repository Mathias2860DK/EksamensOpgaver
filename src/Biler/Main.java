package Biler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ImportData importData = new ImportData();
        ArrayList<Bil> importedBiler = importData.importBiler();
        //System.out.println(importedBiler);
        Garage garage = new Garage();
        //garage.printGarage();

      /*  for (Bil bil: importedBiler) {
            garage.addCarsToGarage(bil);
        }*/
        garage.addCarsToGarage(importedBiler.get(0));
        garage.addCarsToGarage(importedBiler.get(1));
        garage.addCarsToGarage(importedBiler.get(2));
        garage.addCarsToGarage(importedBiler.get(3));
        //garage.printGarage();
        garage.printAllMiljøSvin();

    }
}
