package Day_11_While_DoWhile;

import java.util.Scanner;

public class Circle_DoWhile {
    public static void main(String[] args) {

        // код выполниться в любом случае
        boolean enter = false;
        do {
            System.out.println("Loop DoWhile run anyway");
        }
        while (enter);
        System.out.println("=====================");

        // ничего не выполниться
        boolean enter1 = false;
        while (enter1) {
            System.out.println("Loop DoWhile run anyway");
        }

        // Классная работа
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        System.out.println("Enter zahle");
        int number = scanner.nextInt();
        do {
            System.out.print(count + " ");
            sum = sum + count;
            count++;
        }
        while (number>=count);
        System.out.println();
        System.out.println("Summ alle zahlen bis "+ number + " ist " + sum);
    }
}
