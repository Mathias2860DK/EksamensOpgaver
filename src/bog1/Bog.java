package bog1;

public class Bog {
    int ISBN;
    String title;
    int year;

    public Bog (int ISBN, String title, int year){
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
    }

    public int getISBN (){
        return this.ISBN;
    }
    public String getTitle (){
        return this.title;
    }
    public int getYear (){
        return this.year;
    }

    public void setISBN (int ISBN){
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public String toString(){
        return "ISBN = " + ISBN + "Titel:" + title + " year: " + year;
    }
}
