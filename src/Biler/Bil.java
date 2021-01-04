package Biler;

public class Bil {
    //Number; Make;  Model; Type;  Origin;  Price;     Cylinders;   Horsepower; Weight; Length
    //1;      Acura; MDX;   SUV;   Asia;    $36,945;      10           200;        ;3500;    189
    int number;
    String make;
    String model;
    int price; //Står i dollars, derfor er det en String
    int cylinders;
    int horsePower;

    public Bil(int number, String make, String model, int price, int cylinders, int horsePower) {
        this.number = number;
        this.make = make;
        this.model = model;
        this.price = price;
        this.cylinders = cylinders;
        this.horsePower = horsePower;

    }

    public int getHorsePower(){
        return this.horsePower;
    }


    public String toString() {
        return  number + ", " +
                make + ", " +
                model + ", " +
                price + ", " +
                cylinders + ", " +
                horsePower + "\n";
    }

}
