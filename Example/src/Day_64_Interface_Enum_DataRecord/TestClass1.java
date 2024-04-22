package Day_64_Interface_Enum_DataRecord;

public class TestClass1 implements TestInterface, TestInterface2{

    @Override
    public void testMethod() {
        System.out.println("Interface method #1");
    }

    @Override
    public void testMethod2() {
        System.out.println("Test Class #1");
    }
}
