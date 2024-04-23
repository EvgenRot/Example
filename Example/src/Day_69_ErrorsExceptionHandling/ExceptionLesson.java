package Day_69_ErrorsExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionLesson {
    public static void main(String[] args) {

        divided(10,1);

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

    static void divided(int num1, int num2) {

        // множественный запрос не проходит
        try {
            int result = num1 / num2;
            int[] a = new int[2];
            a[5] = 8;
            System.out.println(result);
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
