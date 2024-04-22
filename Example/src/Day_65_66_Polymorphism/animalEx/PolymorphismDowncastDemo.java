package Day_65_66_Polymorphism.animalEx;

class AnimalDemo {
    void makeSound() {
        System.out.println("Животный шум");
    }
}

class DogDemo extends AnimalDemo {
    void bark() {
        System.out.println("Собачий гав");
    }
}

public class PolymorphismDowncastDemo {

    public static void main(String[] args) {

        AnimalDemo myPet = new DogDemo();

        // Проверяем возможность
        if (myPet instanceof DogDemo) {
            DogDemo myDog = (DogDemo) myPet; // И делаем down-casting
            myDog.bark();                   // Вызываем гав кулю
        }
    }
}
