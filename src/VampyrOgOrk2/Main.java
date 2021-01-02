package VampyrOgOrk2;

public class Main {
    public static void main(String[] args) {
        Vampyr vampyr = new Vampyr();
        System.out.println(vampyr.angrebsMetode());
        String test = "markus";
        String test1 = test.substring(0,1).toUpperCase() + test.substring(2);
        System.out.println(test1);
    }
}
