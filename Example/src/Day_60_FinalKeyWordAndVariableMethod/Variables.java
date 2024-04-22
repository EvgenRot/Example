package Day_60_FinalKeyWordAndVariableMethod;

public class Variables {
    public static void main(String[] args) {

        Variables variables = new Variables();
        variables.instanceMethod();
    }

    int num1; //  exemplars variable, wenn final - muss initialisation sein
    static int class_num; // classes variable


    public Variables() {
        int num2 = 22;  // local variable
        System.out.println("Я конструктор = " + num2);
    }

    public void instanceMethod(){
        int num3 = 33;  //local variable
        System.out.println("Я метод = " + num3);
    }

    {
        int num4 = 44;  //local variable
        System.out.println("Я нестатический блок = " + num4);
    }

    static{
        int num5 = 55;  //local variable
        System.out.println("Я статический блок = " + num5);
    }
}
