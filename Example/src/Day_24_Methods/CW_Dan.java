package Day_24_Methods;

import java.util.Scanner;

public class CW_Dan {
    public static void main(String[] args) {

        methodDan();
    }

    private static void methodDan() {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if (num2 > num1){
            System.out.println(num2+" большее число");
        } else {
            System.out.println(num1+" большее число");
        }
    }
}

