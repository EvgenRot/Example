package Ubung_Bro;

public class OverloadingMethods {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(add(a, b));
        System.out.println(add(a, b, c));
        System.out.println(add(a, b, c, d));
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overloading method #3");
        return a + b + c + d;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloading method #2");
        return a + b + c;
    }

    static int add(int a, int b) {
        System.out.println("Overloading method #1");
        return  a + b;
    }
}
