package Day_65_66_Polymorphism.staticPoli;

public class StaticPoli {

    public static void main(String[] args) {
        method1(10);
        method1("10");
        method1(true);

    }
    static void method1(int a){
        System.out.println("method1 " + a);
    }

    static void method1(String a){
        System.out.println("method2 " + a);
    }

    static void method1(boolean a){
        System.out.println("method3 " + a);
    }
}
