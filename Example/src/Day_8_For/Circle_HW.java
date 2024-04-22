package Day_8_For;

import java.util.Scanner;

public class Circle_HW {
    public static void main(String[] args) {

        System.out.println("Здравствуйте!");
        byte d = 1;
        while (d == 1) {
            // ВВОД И ПРОВЕРКА ПРОСТЫХ И СОСТАВНЫХ ЧИСЕЛ
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = 0;
            boolean c = true;
            for (int i = 2; i < a; i++) {
                b = a % i;
                if (b == 0) {
                    c = false;
                }
            }
            if (c == true) {
                System.out.println("Простое число " + a);
            } else {
                System.out.println("Составное число " + a);
            }
            System.out.println("Закончить работу? Да - 1  Нет - 2 ");
            byte end_job = scanner.nextByte();
            if (end_job == 1) {
                d = 0;
            }
        }
    }
}