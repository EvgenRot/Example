package Day_64_Interface_Enum_DataRecord;

public class DefaultMethodClass implements DefaultMethod{

    public static void main(String[] args) {

        DefaultMethodClass defaultMethodClass = new DefaultMethodClass();
        defaultMethodClass.defaultMethod();
        DefaultMethod.staticMethod();
        DefaultMethod.display();

    }

    @Override
    public void m1() {

    }

    @Override
    public void m2() {

    }

    @Override
    public void defaultMethod() {
        DefaultMethod.super.defaultMethod();
    }
}
