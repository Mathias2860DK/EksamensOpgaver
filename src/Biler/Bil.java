package Biler;

public class Bil {
    //Number; Make;  Model; Type;  Origin;  Price;      EngineSize;  Cylinders;   Horsepower; Weight; Length
    //1;      Acura; MDX;   SUV;   Asia;    $36,945;    6;           6;           200;        ;3500;    189
    int number;
    String make;
    String model;
    String type;
    String origin;
    String price; //Står i dollars, derfor er det en String
    int engineSize;
    int cylinders;
    int horsePower;
    int weight;
    int length;

    public Bil(int number, String make, String model, String type, String origin, String price, int engineSize, int cylinders, int horsePower, int weight, int length) {
        this.number = number;
        this.make = make;
        this.model = model;
        this.type = type;
        this.origin = origin;
        this.price = price;
        this.engineSize = engineSize;
        this.cylinders = cylinders;
        this.horsePower = horsePower;
        this.weight = weight;
        this.length = length;
    }
}
