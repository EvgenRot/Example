package Day_65_66_Polymorphism.parentEx;

public class InheritanceTest {

    public static void main(String[] args) {

        Parent child = new Child();     // полиморфизм, поскольку Parent child, not Child child
        Parent.print();                // можно вызвать статический метод, даже не видя его в списке выбора!!!
        child.printDemo();            // нестатический метод виден, и будет отработан метод наследника
        System.out.println("child.value = " + child.value);
        System.out.println("child.getClass() = " + child.getClass());
        System.out.println("Value is " + child.getValue());
    }
}

class Parent {
    int value = 11;

    Parent() {
        value %= 2;
    }

    public static void print() {
        System.out.println("static method Parent");
    }

    public void printDemo(){
        System.out.println("not static method Parent");
    }

    public int getValue() {
        return this.value;
    }
}

class Child extends Parent {
    int value = 11;

    Child() {
        value *= 2;
    }

    @Override
    public void printDemo() {
        System.out.println("not static method Child ");
    }

        public static void print() {
        System.out.println("static method Child ");
    }

    public int getValue() {
        return this.value;
    }
}
