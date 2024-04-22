package Day_52_Encapsulation2;

import java.time.Month;

public class Enum {
    public static void main(String[] args) {

        Month january = Month.JANUARY;

        switch (january){
            case JANUARY -> System.out.println(java.time.Month.JANUARY);
            case FEBRUARY -> System.out.println(java.time.Month.FEBRUARY);
            case MARCH -> System.out.println(java.time.Month.MARCH);
            case APRIL -> System.out.println(java.time.Month.APRIL);
            case MAY -> System.out.println(java.time.Month.MAY);
            case JUNE -> System.out.println(java.time.Month.JUNE);
            default -> System.out.println("Nicht");
        }

    }
    public enum Month {

        // final static int JANUARY = 1
        JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST
    }
}
