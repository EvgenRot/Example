package Day_65_66_Polymorphism.animalEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AnimalEx {
    void makeSound() {
        System.out.println("Животный шум");
    }
}

class DogEx extends AnimalEx {
    @Override
    void makeSound() {
        System.out.println("Гав! Гав!");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        AnimalEx myPet = new DogEx();
        DogEx myPet1 = new DogEx();
        List<AnimalEx> list = new ArrayList<>(Arrays.asList(myPet, myPet1));

        for (AnimalEx animalEx : list){
            if (myPet instanceof DogEx) {
                System.out.println("myPet это собака!");
            } else if (myPet1 instanceof AnimalEx) {
                System.out.println("myPet какое-то животное \n");
            }
        }
    }
}
