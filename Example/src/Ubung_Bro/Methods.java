package Ubung_Bro;

public class Methods {
    public static void main(String[] args) {

        String name = "Bro";
        int age = 21;
        hello(name, age);

        int x = 3;
        int y = 4;
        System.out.println("Summa : " + add(x,y));

    }
    static void hello(String name, int age){
        System.out.println("Hello " + name + " your is " + age);
    }
    static int add(int x, int y){
        return x + y;
    }
}
