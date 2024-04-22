package Day_31_Random_Math_Date;

import java.util.Random;
import java.util.Scanner;

public class CW_31_GuessNumber {
    public static void main(String[] args) {

        //Угадайка
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        while (true) {
            count++;
            System.out.println();
            System.out.print("Enter integer number ab 1 bis 10 : ");
            int scannerNum = scanner.nextInt();
            int randomNumber = random.nextInt(10 - 1) + 1;
            System.out.print("Random number : " + randomNumber);
            if (scannerNum == randomNumber) {
                break;
            }
        }
        System.out.println();
        System.out.println("You scribe number mit : " + count + " mal");
    }
}
