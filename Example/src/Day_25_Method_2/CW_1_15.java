package Day_25_Method_2;

import java.util.Scanner;

public class CW_1_15 {
    public static void main(String[] args) {

        System.out.println("Введите три числа");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = greatestNumber(a, b, c);

        System.out.println("Максимальное число = " + max);
    }

    private static int greatestNumber(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        return max;
    }

}
