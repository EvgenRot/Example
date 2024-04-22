package Day_25_Method_2;

import java.util.Scanner;

public class CW_Konvertation {
    public static void main(String[] args) {

        //    КОНВЕРТАЦИЯ ИЗ КИЛОМЕТРОВ в МИЛИ

        System.out.print("Введите расстояние в км : ");
        Scanner scanner = new Scanner(System.in);
        double mile = scanner.nextDouble();
        System.out.println("Расстояние в милях : " + convertToMile(mile));

    }

    public static double convertToMile(double km) {
        return km/1.609344;
    }
}
