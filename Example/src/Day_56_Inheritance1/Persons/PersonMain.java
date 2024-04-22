package Day_56_Inheritance1.Persons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        Dancer programmer = new Programmer("Ivan", "танцор диско", "Bad Boys Blue",
                "Оракул");

        System.out.println(programmer);

        Programmer programmer1 = new Programmer();
        Dancer dancer = new Dancer();
        Singer singer = new Singer();

        System.out.println(programmer1);

        List<Person> list = new ArrayList<>(Arrays.asList(dancer, singer, programmer));
        System.out.println(list);

        for(Person person : list){
            System.out.println(/*(Programmer)*/person); // ошибка вылетит при выполнении кода(переопределение)
        }

        programmer.setName("Oleg");
        programmer.eat();   //эти методы прописаны в классе Person, но доступны объекту programmer
        programmer.learnt();
        programmer.walk("Eugen", 56);
        ((Programmer) programmer).coding(); // приведение типов классов (полиформизм)

    }
    static void m(int a, String b){
        System.out.println();
    }
    static void m(/*int a, String b*/String b, int a){ //ошибка сразу будет видна, при написании кода
        System.out.println();
    }
}
