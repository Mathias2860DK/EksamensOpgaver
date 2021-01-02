package bog1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Bog bog = new Bog(12345,"Java Programming",2010);
        Bog bog2 = new Bog(1234,"Python Programming",2018);
        Bog bogTest = new Bog (123222,"nejtak",2020);
        library.addBog(bog);
        library.addBog(bog2);
        System.out.println("denne bog er ikke bibloteket :" + library.isBookInLibrary(bogTest));
        System.out.println("denne bog er i bibloteket :" + library.isBookInLibrary(bog2));

    }
}
