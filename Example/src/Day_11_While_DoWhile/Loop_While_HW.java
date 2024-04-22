package Day_11_While_DoWhile;

import java.util.Scanner;

public class Loop_While_HW {
    public static void main(String[] args) {

        // запись числа наоборот
        System.out.println("Введите число ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        String text = String.valueOf(number);
        String new_text = "";
        long length_number = String.valueOf(number).length();
        for (long i = length_number - 1; i >= 0; i--) {
            new_text = new_text + text.charAt((int) i);
        }

        long new_number = Long.valueOf(new_text);
        System.out.println("Новое число " + new_number);

        // самый изящный способ
        System.out.println("Введите число ");
        Scanner scanner1 = new Scanner(System.in);
        int number1 = scanner1.nextInt();
        int reversedNumber = 0;
        System.out.println(" А вот Вам зеркальное отображение Вашего числа  "); // вывод 0 впереди, если 1000
        while(number1 != 0) {
            reversedNumber = reversedNumber * 10 + number1 % 10;
            number1 /= 10;
            System.out.print(reversedNumber);
        }
//        System.out.println(reversedNumber); // => 54321

        // способ Игоря, при котором выводит целое число с 0 впереди!!!
        System.out.println(" Введите целое число ");
        Scanner scanner2 = new Scanner(System.in);
        int vvod = scanner2.nextInt();
        System.out.println(" А вот Вам зеркальное отображение Вашего числа  ");
        while (vvod>0) {
            int viv = vvod % 10;
            vvod/=10;
            System.out.print(viv);
        }
    }
}
