package Day_65_66_Polymorphism.inheritancePoli;

import Day_65_66_Polymorphism.interfacePoli.IDrive;

public class Vehicle65 {

    String model;

    public static void main(String[] args) {
        Driver driver = new Driver("Oleg");
        Vehicle65 audi = new Audi("Audi");
        driver.drive(audi);

        IDrive driver1 = new Driver("Ali");
        Vehicle65 bmw = new BMW("BMW");
        driver1.drive(bmw);

    }
    public Vehicle65(String model) {
        this.model = model;
    }
}
