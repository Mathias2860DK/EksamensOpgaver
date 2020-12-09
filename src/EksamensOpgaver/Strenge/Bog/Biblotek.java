package EksamensOpgaver.Strenge.Bog;

import java.util.ArrayList;

public class Biblotek {
    ArrayList<Bog> tilgængeligeBøger = new ArrayList<Bog>();

    public boolean isBookInLibrary(Bog bog) {
        if (tilgængeligeBøger.contains(bog.getISBNnummer())) {
            System.out.println("TRUE!");
            return true;
        } else {
            System.out.println("FALSE!");
            return false;
        }
    }
}

