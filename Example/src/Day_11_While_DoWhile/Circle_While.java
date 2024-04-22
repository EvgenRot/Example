package Day_11_While_DoWhile;

import java.util.Scanner;

public class Circle_While {
    public static void main(String[] args) {

        //вывод квадратов чисел, лежащих между двумя введенными с клавиатуры
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter real erste zahle");
        int number1 = scanner.nextInt();
        System.out.println("Enter real zweite zahle");
        int number2 = scanner.nextInt();
        while (number2 > number1) {
                System.out.println(number1 + "*" + number1 + " = " + number1*number1);
            number1++;
        }
    }
}
