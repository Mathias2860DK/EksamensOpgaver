package Biler;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ImportData importData = new ImportData();
        ArrayList<Bil> importedBiler = importData.importBiler();
        System.out.println(importedBiler);
    }
}
