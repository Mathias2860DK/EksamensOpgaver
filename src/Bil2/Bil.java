package Bil2;

public class Bil implements Comparable <Bil> {
    //int number, String make, String model, int cylinders, int horsePower, int length

    int number;
    String make;
    String model;
    int cylinders;
    int horsePower;
    int length;

    public Bil(int number, String make, String model, int cylinders, int horsePower, int length) {
        this.number = number;
        this.make = make;
        this.model = model;
        this.cylinders = cylinders;
        this.horsePower = horsePower;
        this.length = length;
    }

    public int miljøTryk(){
        int miljøTryk = horsePower * cylinders * length;
        return miljøTryk;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", cylinders=" + cylinders +
                ", horsePower=" + horsePower +
                ", length=" + length + "\n";
    }

    @Override
    public int compareTo(Bil o) {
        return this.miljøTryk() - o.miljøTryk();
    }
}
