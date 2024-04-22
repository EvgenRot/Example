package Day_53_StaticClassMembers;

public class MyClass {

    public static  int instanteCount = 0;

    public MyClass() {
        instanteCount++;
    }

    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        MyClass myClass3 = new MyClass();


        System.out.println(MyClass.instanteCount); // три раза создали объекты типа MyClass, 3 раза обратились к
        // конструктору, поэтому имеем значение счетчика = 3

        System.out.println(MathUtils.add(4, 7)); // может и отсюда вывести на консоль статический метод
    }
}
