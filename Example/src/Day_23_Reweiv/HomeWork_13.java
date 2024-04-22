package Day_23_Reweiv;

import java.util.Scanner;

public class HomeWork_13 {
    public static void main(String[] args) {

        // ввод с клавиатуры чисел и счетчик положительных, отрицательных и 0-й
        Scanner scanner = new Scanner(System.in);
        String d = "y";
        int pozitiv, noll, negativ;
        pozitiv = 0;
        noll = 0;
        negativ = 0;
        System.out.println("Введите числа через Enter / Закончить - ввести 666");
        do {
            int a = scanner.nextInt();
            if (a < 0) {
                negativ++;
            } else if (a > 0) {
                if (a == 666) {
                    System.out.print("Продолжаем работу? Да - y(Y)/ Нет - любой другой символ: ");
                    d = scanner.next();
                }
                pozitiv++;
            } else {
                noll++;
            }
        }
        while (d.equals("y"));
        {
            System.out.println("Положительных - " + pozitiv + "\nНолей - " + noll + "\nОтрицательных - " + negativ);
            System.out.println("Auf weidersehen!");
        }

        // ввод с клавиатуры и вычисление дохода по вкладу
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите сумму вклада ");
        double vklad = scanner1.nextDouble();
        System.out.println("Введите % ");
        double prozent = scanner1.nextDouble();
        System.out.println("Введите время депозита в годах");
        int time = scanner1.nextInt();
        int count = 1;
        double dohod = 0;
        while (count <= time) {
            System.out.println("Сумма по вкладу - " + vklad +
                    "\nСумма дохода по вкладу " + vklad + " по процентной ставке "
                    + prozent + " % за " + count + " год - " + (vklad * (prozent / 100)) +
                    "\nИТОГОВАЯ СУММА на конец года: " + (vklad + (vklad * (prozent / 100))));
            System.out.println("--------------------------------------------------------------");
            dohod = dohod + (vklad * (prozent / 100));
            vklad = vklad + (vklad * (prozent / 100));
            count++;
        }

        // proekt Igors
        // ввод с клавиатуры и вычисление дохода по вкладу
        int prod = 1;
        Scanner scanner2 = new Scanner(System.in);
        int otr, pol, nul;
        otr = pol = nul = 0;
        do {
            System.out.println("Введите целое число или 0:");
            int chislo = scanner2.nextInt();
            if (chislo < 0) {
                otr++;
            } else if (chislo > 0) {
                pol++;
            } else {
                nul++;
            }
            System.out.print("Хотите продолжить 1 да, 2-нет");
            prod = scanner2.nextInt();
        } while (prod == 1);
        {
            System.out.println("Количество положительных чисел " + pol);
            System.out.println("Количество отрицательных чисел " + otr);
            System.out.println("Количество нулей = " + nul);
        }
    }
}
