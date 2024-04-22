package Day_29_Class_Objects;

public class Main {
    public static void main(String[] args) {

        Car mersedes = new Car("Mersedes", "600", "2020", "Black", 4);

        // oder
        Car mersedes1 = new Car();
        mersedes1.carName = "Mersedes";
        mersedes1.model = "600";
        mersedes1.year = "2020";
        mersedes1.color = "Black";
        mersedes1.engine = 4;

        // добавляем параметр в виде объекта Door
        Car bmw = new Car();
        bmw.carName = "BMW";
        bmw.model = "300";
        bmw.year = "2024";
        bmw.color = "White";
        bmw.engine = 3;

        Door door = new Door();
        door.carDoor = 4;
        bmw.door = door;

        System.out.println(mersedes1);
        System.out.println(bmw);
        mersedes.displayCar();
        mersedes1.displayCar();
        bmw.displayCar();
        bmw.start();
        bmw.drive();

    }
}
