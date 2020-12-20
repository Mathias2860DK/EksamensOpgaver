package Biler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ImportData {

    public ArrayList <Bil> importBiler(){
        String pathToCsv = "src/Biler/biler.csv";
        String csvSplitBy = ";";
        ArrayList <Bil> bilArrayList = new ArrayList<>();

        try  {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToCsv));
            String line = "";
            line = bufferedReader.readLine(); //spiser første linje (headline) tager den ind uden at gøre noget med den
            while ((line = bufferedReader.readLine()) != null){
                String [] opdeler = line.split(csvSplitBy);

                //int number, String make, String model, String price, int cylinders, int horsePower
               Bil bil = new Bil(Integer.parseInt(opdeler[0]), opdeler[1], opdeler[2], opdeler[3],Integer.parseInt(opdeler[4]), Integer.parseInt(opdeler[5]));
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
