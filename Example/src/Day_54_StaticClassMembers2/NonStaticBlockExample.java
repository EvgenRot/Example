package Day_54_StaticClassMembers2;

public class NonStaticBlockExample {

    static int a = 10;

    static {
        System.out.println("Выполнение статического блока");
    }

    {
        System.out.println("Выполнение нестатического блока");
    }

    public NonStaticBlockExample() {
        System.out.println("Выполнение конструктора");
    }

    public void printSth(){
        System.out.println("Выполнение метода экземпляра каласса");
    }

    public static void main(String[] args) {
        System.out.println("NonStaticBlockExample.a = " + NonStaticBlockExample.a);
        System.out.println("Выполнение main метода");
        NonStaticBlockExample nonStaticBlockExample = new NonStaticBlockExample();
        nonStaticBlockExample.printSth();
    }
}
