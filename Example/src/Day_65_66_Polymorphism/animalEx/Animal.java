package Day_65_66_Polymorphism.animalEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal {
    public static void main(String[] args) {

        Animal s = new Dog();
        Animal u = new Duck();
        Animal k = new Cat();
        Animal a = new Animal();

        List<Animal> list = new ArrayList<>(Arrays.asList(s,u,k,a));
//        Animal[] animals = {s, u, k, a};      // oder array

        for (Animal animal : list) {
            animal.makeSound();
            System.out.println("Method makeSound aus Class " + animal.getClass().getName());
        }
    }
    void makeSound() {
        System.out.println("Животный шум");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Гавк");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Мявк");
    }
}

class Duck extends Animal {
    @Override
    void makeSound() {
        System.out.println("Кряк");
    }
}
