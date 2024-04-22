package Day_58_AccessModifier.NesstedAndInnerClass;

public class NestedLesson {

    static private int var1 = 100;
    private String str1;

    //Вложенный класс(статический внутренний класс) / Nested class / Может иметь любой модификатор доступа
    public static class NestedClass {
        double x1 = 199;
        String st = "Nested Class Method";

        void nestedMethod() {
            System.out.println(var1);
        }
    }

    // Внутренний класс / Inner class / Может иметь любой модификатор доступа
    public class InnerClass {
        int a = 100;
        String b = "Inner Class Method";

        void innerMethod(){
            System.out.println(str1);
        }

    }

    void outerMethod() {
        System.out.println(var1);

    }

    static void outerStaticMethod() {
        System.out.println(var1);
    }

}

