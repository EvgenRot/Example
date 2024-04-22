package Day_64_Interface_Enum_DataRecord;

// public class AbstractClass implements TestInterface, TestInterface2{ // неабстрактный класс не требует
// имплементации методов интерфейса!!!

public abstract class AbstractClass implements TestInterface, TestInterface2{

    public abstract void abstractMethod();

    public static void main(String[] args) {

        AbstractClass abstractClass = new AbstractClass() {  // анонимный класс потребует имплементацию методов
            @Override
            public void testMethod2() {

            }

            @Override
            public void testMethod() {

            }

            @Override
            public void abstractMethod() {
                System.out.println("Abstract Method");
            }
        };

        abstractClass.abstractMethod();
    }
}
