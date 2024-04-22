package Day_23_Reweiv;

import java.util.Scanner;

public class Class_Work_13 {
    public static void main(String[] args) {

        // summa pervych 10 chisel
        int sum =0;
        for (int i=1;i<=10;i++){
            sum = sum + i;
        }
        System.out.println(sum);

        // ввод с клавиатуры целого числа и вывод на экран таблицы умножения
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число ");
        int a = scanner.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(i + " * " + a + " = " + i*a );
        }

        // введите два числа, сложите их выведите на экран, потом спросите, надо ли продолжать
        int d = 1;
        do {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите целое число ");
            int a1 = scanner.nextInt();
            System.out.println("Введите еще одно целое число ");
            int b1 = scanner.nextInt();
            System.out.println(a1 +" + " + b1 + " = " + (a1+b1));
            System.out.println("Продолжаем работу? Да - 1/ Нет - 2");
            d = scanner.nextInt();
         }
        while ((d == 1));
        {
            System.out.println("Auf weidersehen!");
        }
    }
}
