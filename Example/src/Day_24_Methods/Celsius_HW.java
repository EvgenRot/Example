package Day_24_Methods;

import java.util.Scanner;

public class Celsius_HW {
    public static void main(String[] args) {

        //    КОНВЕРТАЦИЯ ИЗ ГРАДУСОВ ИЗ ФАРЕНГЕЙТОВ В ГРАДУСЫ

        System.out.print("Enter temperature in Farenheit : ");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        System.out.println("Temperature in Celsius : " + convertToCelsius(temperature));

    }

    public static double convertToCelsius(double temperature) {
        return (temperature - 32) * 5 / 9;
    }
}
