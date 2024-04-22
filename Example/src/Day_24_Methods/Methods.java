package Day_24_Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        // Сумма трех чисел разных типов
        // Выводит любопытный результат
        // Сумма чисел 10 + 20.01 + 30 = 60.010000000000005
        int summa = (int) sumOfNumbers(10, 20.01, (short) 30);
        System.out.println(summa);

        // Ввод с клавиатуры и сравнение двух чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        double a = (int) scanner.nextDouble();
        double b = scanner.nextInt();

        displayMessage((int) a, (int) b);
    }

    public static double sumOfNumbers(int a, double b, short c) {

        double sum = a+b+c;
        System.out.println("Сумма чисел " + a + " + " + b + " + " + c + " = " + sum);
        return sum;
    }

    public static void displayMessage(int a, int b) {
        if(a<b) {
            System.out.println("Наибольшее число - " + b);
        } else if (a>b){
            System.out.println("Наибольшее число - " + a);
        }else {
            System.out.println("Оба числа равны");
        }
    }
}
