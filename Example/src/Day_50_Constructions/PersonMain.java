package Day_50_Constructions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

public class PersonMain {
    public static void main(String[] args) {

        Person person = new Person("aaa",10, "000000");
        Person person1 = new Person("bbb",20, "111");
        Person person2 = new Person("ccc",30, "22222");
        Person person3 = new Person("ddd",40, "333333");
        Person person4 = new Person("eee",50, "44444");
        person1.setName("aaa1");
        person2.setName("ccc1");

        ArrayList<Person> personList = new ArrayList<>(Arrays.asList(person,person1,person2,person3,person4,
                new Person("fff",60, "555555")));

        Person persons = personList.get(0);
        person.setName("aaa1");
        System.out.println("До изменения = " + personList);
        System.out.println("==================");

        int indexOfddd = personList.lastIndexOf(person3); // method not work!!!
        Person personIndex = personList.get(indexOfddd);
        personIndex.setName("ddd2");

        for (int i = 0; i<personList.size(); i++){
            if(personList.get(i).getName().equals("ddd")){
                personList.get(i).setName("ddd1");
            }
        }
        System.out.println("После изменения = " + personList);
    }
}
