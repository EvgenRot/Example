package Day_65_66_Polymorphism.inheritancePoli;

public class PolymorphismExample {

    public static void main(String[] args) {

// Создаём экземпляры мотоцикла и машины с типом интерфейса
        Vehicle myCar = new Car();
        Vehicle myMotorcycle = new Motorcycle();

// Используем полиморфизм, чтобы делать наши дела
        startAndStop(myCar);
        startAndStop(myMotorcycle);
    }
// Метод с полиморфизмом по интерфейсу
    static void startAndStop(Vehicle vehicle) {
        vehicle.start();
        vehicle.stop();
    }
}

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Машина завелась, дрдрдр");
    }

    @Override
    public void stop() {
        System.out.println("Машина заглохла");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Мотоцикл завёлся, ДРДРДРДР");
    }

    @Override
    public void stop() {
        System.out.println("Мотоцикл заглох");
    }
}

