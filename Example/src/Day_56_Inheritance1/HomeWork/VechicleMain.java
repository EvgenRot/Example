package Day_56_Inheritance1.HomeWork;

public class VechicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Sony");
        car.setDoorNumber(4);
        car.setLenght(3.3);
        car.setLights(4);
        car.setTiresSize(56);
        car.setName("Jetta C");
        car.setSeats(5);
        car.setWeight(2.1);
        System.out.println(car);
    }
}
