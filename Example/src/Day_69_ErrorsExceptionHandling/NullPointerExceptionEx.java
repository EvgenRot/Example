package Day_69_ErrorsExceptionHandling;

import Day_56_Inheritance1.Persons.Person;

public class NullPointerExceptionEx {
    public static void main(String[] args) {

        System.out.println(Double.MAX_VALUE);

        Double result = (Double.MAX_VALUE + 10);
        System.out.println(result);
        System.out.println(Double.isNaN(result));

        Person person = null;

        if(person == null){
            try {
                personMethod(person);
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

        } else {
            System.out.println("Person is null");
        }


    }
    static void personMethod(Person person){
        try {
            System.out.println(person.getName());
        } catch (Exception e){
//            throw new RuntimeException();
            System.out.println(e.getMessage());
        }
    }
}
