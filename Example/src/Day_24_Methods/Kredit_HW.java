package Day_24_Methods;

import java.util.Scanner;

public class Kredit_HW {
    public static void main(String[] args) {

        //    ПРОВЕРКА ЕЖЕМЕСЯЧНОГО ДОХОДА ДЛЯ ПОЛУЧЕНИЯ КРЕДИТА
        Scanner scanner = new Scanner(System.in);
        // за сколько месяцев требуется узнать доход кредитуемого
        System.out.print("Введите количество месяцев для проверки дохода : ");
        int time = scanner.nextInt();
        userEligibleOrNot(scanner, time);
    }

    private static void userEligibleOrNot(Scanner scanner, int time) {
        int summa_all = 0;
        for (int i = 1; i <= time; i++) {
            System.out.print("Введите сумму ежемесячного дохода за " + i + " месяц : ");
            int summa = scanner.nextInt();
            summa_all = summa_all + summa;
        }
        if (summa_all/ time < 1000) {
            System.out.println("Ваш среднемесячный доход = " + (summa_all/ time) + "\nСожалеем, но кредит Вам не положен" );
        } else {
            System.out.println("Ваш среднемесячный доход = " + (summa_all/ time) + "\nПоздравляем, Вы получаете кредит!" );
        }
    }
}
