package Day_64_Interface_Enum_DataRecord;

public interface DefaultMethod {

    void m1();

    void m2();

    public static void display(){
        System.out.println("public static void display()");
    }

    default void defaultMethod() {      // after 8 JDK
        System.out.println("Hallo!");
        privateMethod();
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
        privateStaticMethod();
    }

    private static void privateStaticMethod() {
        System.out.println("privateStaticMethod");
    }
}
