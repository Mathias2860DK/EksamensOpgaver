package Bil2;

import Bil2.Bil;
import Bil2.ImportData;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ImportData importData = new ImportData();
        Bil bil = new Bil(6,"BMW", "i8",10,500,210);
        //Garage garage = new Garage();
        //garage.addBil(bil);
        ArrayList<Bil> importedBiler = importData.importBiler();
        //importedBiler.add(bil);
        //System.out.println(importedBiler);
       // System.out.println(importedBiler.get(1).miljøTryk());
        for (int i = 0; i < importedBiler.size(); i++) {
            System.out.println(importedBiler.get(i).miljøTryk());
        }
        System.out.println();
        System.out.println();
        Collections.sort(importedBiler);
        for (int i = 0; i < importedBiler.size(); i++) {
            System.out.println(importedBiler.get(i).miljøTryk());
        }
        System.out.println("Største miljøsvin: " + importedBiler.get(importedBiler.size()-1));
        System.out.println("Største miljøsvin: " + Collections.max(importedBiler));

        System.out.println("Top 3");
        System.out.println("1: " + importedBiler.get(importedBiler.size()-1).miljøTryk());
        System.out.println("2: " + importedBiler.get(importedBiler.size()-2).miljøTryk());
        System.out.println("3: " + importedBiler.get(importedBiler.size()-3));
    }
}
