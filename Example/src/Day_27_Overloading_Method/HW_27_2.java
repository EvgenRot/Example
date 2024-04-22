package Day_27_Overloading_Method;

import java.time.Year;

public class HW_27_2 {
    public static void main(String[] args) {

        String name = "Oleg";
        int yearOfBirth = 1990;
        int ageRetierment = 60;
        int age;

        age = calculateAge(name, yearOfBirth);

        yearsUntilRetierment(name, ageRetierment, age);

    }

    private static void yearsUntilRetierment(String name, int age, int ageRetierment) {

        System.out.println(name + " выходит на пенсию через " + (ageRetierment - age) + " лет");
    }

    private static int calculateAge(String name, int yearOfBirth) {
        int currentYear = Year.now().getValue();
        int age = currentYear - yearOfBirth;
        System.out.println("Возраст " + name + " - " + age);
        return age;
    }
}
