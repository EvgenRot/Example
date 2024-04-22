package Day_27_Overloading_Method;

public class OverloadingMethod {

    // главный метод только с main(String[] args)
    public static void main(String[] args) {

        double a = 10, b = 20, c = 30;
        System.out.println(calculator(a, b));
        System.out.println(calculator((int) a, (int)b, (int) c));
    }
    public static void main(int a, int b) {
        // это перегруженный метод main - он не может быть главным!!!
    }

    // можно передавать разное количество параметров одним и тем же методом
    public static int calculator(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    //можно поменять местами параметры
    public static double calculator(double num2, double num1) {
        return (num2 / num1);
    }
}
