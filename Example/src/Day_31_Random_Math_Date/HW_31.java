package Day_31_Random_Math_Date;

import java.util.Random;
import java.util.Scanner;

public class HW_31 {
    public static void main(String[] args) {

        System.out.print("Введите любое целое число от 1 дод 10 : ");
        Scanner scanner = new Scanner(System.in);
        int numberUser = scanner.nextInt();

        RandomUser.countAttemp(numberUser);
    }
}
class RandomUser {
    int numUser, numComp, count;

    public RandomUser(int numUser, int numComp, int count) {
        this.numUser = numUser;
        this.numComp = numComp;
        this.count = count;
    }

    static void countAttemp(int numberUser) {
        int count = 0;
        Random random = new Random();
        while (true) {
            int numberComp = random.nextInt(10-1)+1;
            count++;
            if (alarm(count)) break;
            System.out.println("Следующий номер : " + numberComp);
            if (numberComp == numberUser) {
                System.out.println("Ваш номер выпал с " + count + " раза");
                break;
            }
        }
    }

    private static boolean alarm(int count) {
        if (count >5) {
            System.out.println("СТОП! Это уже шестая попытка!");
            return true;
        }
        return false;
    }
}
