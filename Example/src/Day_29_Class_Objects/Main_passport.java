package Day_29_Class_Objects;

public class Main_passport {
    public static void main(String[] args) {

        Person person = new Person(111111,"Ali");
        String name = person.name;
        System.out.println(name);

        int passportNo = person.passportNo;
        System.out.println(passportNo);

        Person.nationality = "Iranian";
        Person.displayPersonInfo();

    }
}
