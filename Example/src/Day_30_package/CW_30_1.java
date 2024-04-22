package Day_30_package;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CW_30_1 {
    public static void main(String[] args) {

        StatCalculator calculator = new StatCalculator();
        Scanner scanner = new Scanner(System.in);

        double number = 1;
        while (number != 0 ) {
            System.out.println("Введите дробное число: ");
            number = scanner.nextDouble();
            if (number != 0) {
                calculator.enter(number);
            }
        }
        System.out.println("Кол-во чисел = " + calculator.getCount());
        System.out.println("Сумма введенных чисел = " + calculator.getSum());
        System.out.println("Min number = " + calculator.getMin());
        System.out.println("Max number = " + calculator.getMax());
        System.out.println("Среднее значение всех чисел = " + calculator.getAverage());


    }
}
