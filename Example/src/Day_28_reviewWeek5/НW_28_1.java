package Day_28_reviewWeek5;

import java.util.Scanner;

public class НW_28_1 {
    public static void main(String[] args) {

        System.out.println("Введите через пробел два числа и оператор : \nДля окончания работы введите ноль");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String action = scanner.nextLine();
            if (!(action.equals("0"))) {
                int label = action.indexOf(" ");
                double a = Double.parseDouble(action.substring(0,label));
                String i = action.substring(label+1, label+2);
                double b = Double.parseDouble(action.substring(label+3));

                switch (i) {
                    case "+":
                        System.out.println("a + b = " + (a + b));
                        break;
                    case "-":
                        System.out.println("a - b = " + (a - b));
                        break;
                    case "*":
                        System.out.println("a * b = " + (a * b));
                        break;
                    case "/":
                        try {
                            System.out.println("a / b = " + (a / b));
                            break;
                        } catch (Exception e) {
                            System.out.println("Деление на ноль");
                        }
                    default:
                        System.out.println("Недопустимый оператор");
                }
            } else {
                System.out.println("Работа завершена");
                break;
            }
        }
    }
}
