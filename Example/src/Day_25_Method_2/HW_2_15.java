package Day_25_Method_2;

import java.util.Scanner;

public class HW_2_15 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Введите число звездочек в основании треугольника - ");
        int stars = scanner.nextInt();
        printStars(stars);
    }

    private static void printStars(int stars) {
        int r, c;
        for (r = 1; r <= stars; r++) {
            for (c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
