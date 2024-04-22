package Day_29_Class_Objects;

public class Car {

    public Door door;
    public  String carName; // в объектах мы не можем использовать статические переменные
    public  String model;
    public  String year;
    public  String color;
    public int engine;


    public Car(String carName, String model, String year, String color, int engine) {

        // параметры определяются сразу, при создании переменной типа Объект
        this.carName = carName;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engine = engine;
    }

    public  Car() {

        // параметры будут объявлены позже, в выполняемом модуле
    }

    public void start () {
        System.out.println(carName + " begin stared");
    }

    public void  drive () {
        System.out.println(carName + " begin drived");
    }

    public void  displayCar () {
        System.out.println("Name " + carName + " , model " + model + " , year "
                + year + " , color " + color + " , engine " + engine + " door " + door);
    }

    @Override
    public String toString() {
        return "Car{" +
                "door=" + door +
                ", carName='" + carName + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}


