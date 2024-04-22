package Day_35_Java_Memory_Garbage_Collection;

public class JavaMemory {
    public static void main(String[] args) {

        Account parent = new Account();
        m1();
        System.gc(); // ручной вызов сборщика мусора
        Runtime.getRuntime(); // ручной вызов сборщика мусора 2 вариант
    }
    public static void m1(){
        int x = 20;
        m2(10);
        System.out.println("Method m1");
    }
    public static void m2(int b){
        boolean c;
        m3();
        System.out.println("Method m2");
    }

    public static void m3(){
        Account ref = new Account();
        System.out.println("Method m3");
    }
}
