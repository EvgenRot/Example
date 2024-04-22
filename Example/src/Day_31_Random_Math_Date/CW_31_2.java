package Day_31_Random_Math_Date;

import java.util.Random;

public class CW_31_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int random2;
        while (true) {
            int randomNumber = random.nextInt(100);
            if (randomNumber <= 90) {
                System.out.println("Random number = " + randomNumber);
            } else {
                System.out.println("Random number = " + randomNumber + "\nSTOP! Random number > 90");
                break;
            }
        }

        do {
            random2 = random.nextInt(4);
            System.out.println(random2);
        } while (random2<3); {
            System.out.println("STOP");
        }

        // вариант Дениса !!! Выпадает 0 !!!

            int count = 0;
            do {
                count++;
                int randomNumber = random.nextInt(10);
                System.out.println("Случайное число= " + randomNumber);
                if (randomNumber ==3) {
                    break;
                }
                if (count==5) {
                    System.out.println("Ошибка, число 3 не выпало за 5 попыток");
                    break;
                }
            } while (true);
            System.out.println("Ваш номер выпал с "+count+ " раза");

        }
    }

