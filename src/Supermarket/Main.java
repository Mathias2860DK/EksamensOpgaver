package Supermarket;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    /*

     */
    public static void main(String[] args) {
        ImpoterVare impoterVare = new ImpoterVare();
        List <Vare> vareListResult = impoterVare.addVareList();
        
        System.out.println(Arrays.toString(vareListResult.toArray()));
    }
}
