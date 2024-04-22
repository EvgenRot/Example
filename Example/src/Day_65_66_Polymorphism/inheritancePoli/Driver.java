package Day_65_66_Polymorphism.inheritancePoli;

import Day_65_66_Polymorphism.interfacePoli.IDrive;

public class Driver implements IDrive {

    String name;
    Vehicle65 vehicle65;

    public Driver(String name) {
        this.name = name;
    }

    public Driver(String name, Vehicle65 vehicle65) {
        this.name = name;
        this.vehicle65 = vehicle65;
    }

    public void drive(Vehicle65 vehicle65){
        System.out.println(name + " drive " + vehicle65.model);
    }
}
