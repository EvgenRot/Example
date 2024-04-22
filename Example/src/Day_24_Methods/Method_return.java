package Day_24_Methods;

import java.util.Scanner;

public class Method_return {
    public static void main(String[] args) {

        // ввод с клавиатуры и сравнение двух чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        double a = (int) scanner.nextDouble();
        double b = scanner.nextInt();
        int result = returnMethod(a, b);
        System.out.println("Результат - " + result);
    }

    public static int returnMethod(double a, double b) {
        if (a < b) {
            return (int) b;
        } else if (a > b) {
            return (int) a;
        } else {
            System.out.println("Оба числа равны");
            return (int) a;
        }
    }
}
