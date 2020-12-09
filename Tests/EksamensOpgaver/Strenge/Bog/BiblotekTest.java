package EksamensOpgaver.Strenge.Bog;

import org.junit.Test;

import java.util.ArrayList;

public class BiblotekTest {

    @Test
    public boolean isBookInLibrary() {
        Bog bog1 = new Bog("1234", "Java Programming", 2010);
        Bog bog2 = new Bog("222", "Python Programming", 2020);
        ArrayList<Bog> tilgængeligeBøger = new ArrayList<Bog>();
        tilgængeligeBøger.add(bog1);
        tilgængeligeBøger.add(bog2);
boolean expected = true;
boolean actual = false;

        if (tilgængeligeBøger.contains(bog1.getISBNnummer())){
            return expected;
        }else {
            return actual;
        }
        // if (tilgængeligeBøger.contains(bog1))

    }

}