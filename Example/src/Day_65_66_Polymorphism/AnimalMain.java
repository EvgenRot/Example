package Day_65_66_Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain{

    public static void main(String[] args) {

        System.out.println("=============== lange variante  ========================");

        Cat cat = new Cat();
        Dog dog = new Dog();
        Hen hen = new Hen();

        List<Cat> listCat = new ArrayList<>();
        List<Dog> listDog = new ArrayList<>();
        List<Hen> listHen = new ArrayList<>();
        listCat.add(cat);
        listDog.add(dog);
        listHen.add(hen);

        for(Animals65 animals65 : listCat){
            animals65.sound();
        }
        for(Animals65 animals65 : listDog){
            animals65.sound();
        }
        for(Animals65 animals65 : listHen){
            animals65.sound();
        }

        System.out.println("============== oder sehr kurze variante ===============");

        ISound cat1 = new Cat();
        ISound dog1 = new Dog();
        ISound hen1 = new Hen();

        List<ISound> list = new ArrayList<>();
        list.add(cat1);
        list.add(dog1);
        list.add(hen1);

        for(ISound animals : list){
            animals.sound();
        }
    }
}
