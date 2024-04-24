package Day_69_70_ErrorsExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {

        multiDivided(10,0);     // попытка обработки множественного запроса

        // обработка исключения ошибочного формата ввода значения для сканера(вместо числа - строка)
        // в блок try помещаем bug код, а в catch ставим RunTimeException c e.printStackTrace() и узнаем точное
        // название исключения, затем меняем e.printStackTrace() на System.out.println(e.getMessage())
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter number : ");
            System.out.println("CONSOLE : " + scanner.nextInt());

        } catch (InputMismatchException e) {
            System.out.println("Except : " + e.getMessage());   // oder
            System.out.println("Except : " + e);
        }
    }

    static void multiDivided(int num1, int num2) {

        // множественный запрос не проходит, и будет обработано только первое исключение ArithmeticException
        try {
            int result = num1 / num2;   // ArithmeticException
            System.out.println(result);

            int[] a = new int[2];
            a[5] = 8;               // ArrayIndexOutOfBoundsException
            System.out.println(a[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
