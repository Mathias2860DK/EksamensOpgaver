package Bil2;


import Bil2.Bil;
import Bil2.Main;
import Bil2.Bil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportData {

    public ArrayList<Bil> importBiler(){
        String pathToCsv = "src/Bil2/biler2.csv";
        String csvSplitBy = ";";
        ArrayList <Bil> bilArrayList = new ArrayList<>();

        try  {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToCsv));
            String line = "";
            line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null){
                String [] opdeler = line.split(csvSplitBy);

                //int number, String make, String model, int cylinders, int horsePower, int length
                Bil bil = new Bil(Integer.parseInt(opdeler[0]), opdeler[1], opdeler[2], Integer.parseInt(opdeler[3]),Integer.parseInt(opdeler[4]), Integer.parseInt(opdeler[5]));
                bilArrayList.add(bil);
            }

        } catch (FileNotFoundException e){
            System.out.println("filen blev ikke fundet");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bilArrayList;

    }


}


