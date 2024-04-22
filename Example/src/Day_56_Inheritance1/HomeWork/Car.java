package Day_56_Inheritance1.HomeWork;

public class Car extends Vechicle{
    protected double tiresSize;
    protected String brand;
    protected int doorNumber;

    @Override
    public String toString() {
        return "Car{" +
                "tiresSize=" + tiresSize +
                ", brand='" + brand + '\'' +
                ", doorNumber=" + doorNumber +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", lenght=" + lenght +
                ", seats=" + seats +
                ", lights=" + lights +
                '}';
    }

    public Car() {
    }

    public Car(String name, double weight, double lenght, int seats, int lights, double tiresSize, String brand, int doorNumber) {
        super(name, weight, lenght, seats, lights);
        this.tiresSize = tiresSize;
        this.brand = brand;
        this.doorNumber = doorNumber;
    }

    public Car(double tiresSize, String brand, int doorNumber) {
        this.tiresSize = tiresSize;
        this.brand = brand;
        this.doorNumber = doorNumber;
    }

    public void honk(){
        System.out.println("To give a signal");
    }

    public void handBreak(){
        System.out.println("Break up");
    }

    public void openTrunk(){
        System.out.println("Open trunk");
    }

    public void setTiresSize(double tiresSize) {
        this.tiresSize = tiresSize;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }
}
