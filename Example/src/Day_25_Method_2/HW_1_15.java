package Day_25_Method_2;

import java.util.Scanner;

public class HW_1_15 {
    public static void main(String[] args) {

        System.out.println("Введите два числа и оператор : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String c = scanner.next();
        calculator(a, b, c);
    }

    private static void calculator(int a, int b, String c) {
        switch (c) {
            case "+" :
                System.out.println("a + b = " + (a + b));
                break;
            case "-" :
                System.out.println("a - b = " + (a - b));
                break;
            case "*" :
                System.out.println("a * b = " + (a * b));
                break;
            case "/" :
                try {
                    System.out.println("a / b = " + (a / b));
                    break;
                } catch (Exception e){
                    System.out.println("Деление на ноль");
                }
            default:
                System.out.println("Недопустимый оператор");
                return;
        }
    }
}
