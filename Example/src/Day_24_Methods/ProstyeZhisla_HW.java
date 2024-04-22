package Day_24_Methods;

public class ProstyeZhisla_HW {
    public static void main(String[] args) {

        //	ПРОВЕРКА ПРОСТЫХ ЧИСЕЛ ИЗ ЗАДАННОГО ДИАПАЗОНА
        System.out.println("Простые числа : ");
        for (int i = 2; i <= 500; i++) {
            boolean isPrime = true;

            isPrime = isPrime(i, isPrime);
             if (isPrime) {
                System.out.print(" " + i);
            }
        }

    }

    private static boolean isPrime(int i, boolean isPrime) {
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}

