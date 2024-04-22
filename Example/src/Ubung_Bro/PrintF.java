package Ubung_Bro;

public class PrintF {
    public static void main(String[] args) {

        int i = 123;
        double d = 1000.0;
        boolean b = true;
        char ch = '@';
        String str = "String";

        System.out.printf("Text %b", b); //This is format string - Text
        System.out.println(String.format("Text %b", b));    // oder so
        System.out.printf("Text %c", ch); //This is format string - Text @
        System.out.println();
        System.out.printf("Text %s", str); //This is format string - Text String
        System.out.println();
        System.out.printf("Text %d", i); //This is format string - Text 123
        System.out.println();
        System.out.printf("Text %f", d); //This is format string - Text 1000,000000
        System.out.println();

        System.out.printf("Text %10s", str); //This is format string - Text     String
        System.out.println();

    }
}
