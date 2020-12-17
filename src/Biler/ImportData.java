package Biler;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportData {

    public ArrayList <Bil> importBiler(){
        String pathToCsv = "src/Biler/ImportData.java";
        String line = "";
        String csvSplitBy = ";";
        ArrayList <Bil> bilArrayList = new ArrayList<>();
        //Bil bil = new Bil();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToCsv))) {
            line = "";
            //line = bufferedReader.readLine(); //spiser første linje (headline)
            while ((line = bufferedReader.readLine()) != null){
                String [] opdeler = line.split(csvSplitBy);
                //0int number, 1String make, 2String model, 3String type, 4String origin, 5String price, 6int engineSize, 7int cylinders, 8int horsePower, 9
                // 10int weight, 11int length
                Bil bil = new Bil(Integer.parseInt(opdeler[0]),opdeler[1],opdeler[2],opdeler[3],opdeler[4],opdeler[5],
                        Integer.parseInt(opdeler[6]),Integer.parseInt(opdeler[7]),Integer.parseInt(opdeler[8]),Integer.parseInt(opdeler[9]),
                        Integer.parseInt(opdeler[10]));
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
