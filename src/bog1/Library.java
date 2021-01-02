package bog1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Bog> bogList = new ArrayList<>();

    public void addBog(Bog bog) {
        bogList.add(bog);
    }

    public Library() {
    }

    public boolean isBookInLibrary(Bog bog) {
        int ISBN = bog.getISBN();
        for (Bog curentBog : bogList) {
            if (curentBog.getISBN() == ISBN) {
                return true;
            }
        }
        return false;
    }
}
