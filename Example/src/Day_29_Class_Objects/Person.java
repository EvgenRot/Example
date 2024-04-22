package Day_29_Class_Objects;

public class Person {

    public static String nationality;

    public int passportNo;
    public String name;

    public Person(int passportNo, String name) {
        this.passportNo = passportNo;
        this.name = name;
    }

    public int getPassportNo(){
        return passportNo;
    }

    public static void displayPersonInfo(){
        System.out.println(nationality);
    }
}

