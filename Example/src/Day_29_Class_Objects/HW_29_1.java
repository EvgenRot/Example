package Day_29_Class_Objects;

import java.util.Scanner;

public class HW_29_1 {
    public static void main(String[] args) {

        System.out.println("Задайте радиус круга - ");
        final var scanner = new Scanner(System.in);
        int radius = scanner.nextInt();

        Circle circle = new Circle();

        System.out.println("Площадь круга с радиусом " + radius + " = " + circle.squeCircle(radius));
    }
}
