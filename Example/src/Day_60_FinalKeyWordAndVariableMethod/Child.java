package Day_60_FinalKeyWordAndVariableMethod;

public class Child extends Parent{

    int var = 33;

    public static void main(String[] args) {

        Child child = new Child();

        child.parentVar();

        Parent.parentStaticMethod();

        parentStaticMethod();

    }

    public static void parentStaticMethod(){

        System.out.println("childStaticMethod");
    }

    @Override
    public void parentVar() {

        System.out.println("childNum = " + this.var);

        super.parentVar();
    }
}
