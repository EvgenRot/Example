package Day_56_Inheritance1.HomeWork;

public class Vechicle {
    protected String name;
    protected double weight, lenght;
    protected int seats, lights;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setLights(int lights) {
        this.lights = lights;
    }

    public Vechicle(String name, double weight, double lenght, int seats, int lights) {
        this.name = name;
        this.weight = weight;
        this.lenght = lenght;
        this.seats = seats;
        this.lights = lights;
    }

    public Vechicle() {

    }

    public void start(){
        System.out.println("Start");
    }
    public void stop(){
        System.out.println("Stop");
    }
    public void move(){
        System.out.println("Go!");
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", lenght=" + lenght +
                ", seats=" + seats +
                ", lights=" + lights +
                '}';
    }
}
