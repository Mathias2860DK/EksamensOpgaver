package EksamensOpgaver.Strenge.Bog;

public class Main {

    public static void main(String[] args) {
Bog bog1 = new Bog("1234","Java Programming",2010);
Bog bog2 = new Bog("222","Python Programming", 2020);
Bog bog3 = new Bog("1234","Python Programming",2020);


Biblotek biblotek = new Biblotek();
biblotek.tilgængeligeBøger.add(bog1);
biblotek.tilgængeligeBøger.add(bog2);
biblotek.tilgængeligeBøger.add(bog3);

        biblotek.isBookInLibrary(bog1);
        System.out.println(biblotek.tilgængeligeBøger);

    }
}
