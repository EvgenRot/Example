package Day_43_WrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
    public static void main(String[] args) {


        int a = 10;
        double b = 10.0;
        short c = 1;
        byte d = 2;
        float e = 2.0f;
        long f = 123;
        boolean g = true;
        char h = '!';

        // Autopackung
        Integer a1 = a;
        Double b1 = b;
        Short c1 = c;
        Byte d1 = d;
        Float e1 = e;
        Long f1 = f;
        Boolean g1 = g;
        Character h1 = h;

        String str1 = String.valueOf(1234567);
        Integer i = Integer.parseInt(str1);
        System.out.println(i.getClass());  // kann man uber Integer kennen
        System.out.println(str1.getClass()); // kann man uber String kennen

        Integer a2 = 1;
        Double b2 = 3.14;
        Float e2 = Float.valueOf( 5.14f);
        Long f2 = Long.valueOf(100);
        Byte d4 = Byte.valueOf("123");
        Byte d5 = Byte.parseByte("119");

        // Constants in Wrapper classes
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        byte min_byte = Byte.MIN_VALUE;
        byte max_byte = Byte.MAX_VALUE;
        long min_long = Long.MIN_VALUE;
        long max_long = Long.MAX_VALUE;
        char min_char = Character.MIN_VALUE;
        char max_char = Character.MAX_VALUE;

        //Usefull methods aus Character
        System.out.println(Character.isAlphabetic('a')); // kann man uber alfaber kennen
        System.out.println(Character.isDigit('1')); // kann man uber digit kennen
        System.out.println(Character.isLetter('j')); // kann man uber buchstabe kennen

        Integer aaa = Integer.valueOf(23);
        int aa = aaa.intValue();
        Integer a4 = aa;
        System.out.println(a4.getClass());

        // Autopackung
        int a6 = 10;
        Integer integer10 = a6;

        // Unpackung
        Integer int10 = 10;
        int a7 = int10;


 //       List<int> list = new ArrayList<>(); // falsch anmeldung Type von List
        List<Integer> list = new ArrayList<>(); // richtige anmeldung Type von List



    }
}
