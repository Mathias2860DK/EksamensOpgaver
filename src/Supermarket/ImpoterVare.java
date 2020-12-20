package Supermarket;

import java.util.ArrayList;
import java.util.List;

public class ImpoterVare {

    public List <Vare> addVareList(){
        List <Vare> vareList = new ArrayList<>();
        Vare vare = new Vare("Banan",2.5,1108);
        Vare vare1 = new Vare("Æble",2.5,1159);
        Vare vare2 = new Vare("Winston Blå 100", 50.00,1);
        vareList.add(vare);
        vareList.add(vare1);
        vareList.add(vare2);

        return vareList;
    }
}
