package Day_28_reviewWeek5;

public class CW_28_1 {

    public static void main(String[] args) {

        System.out.println("Количество цифр 2 : " + sum(25122222) + " шт");
    }

    public static int sum(int num) {

        int lange_b = String.valueOf(num).length();
        int count_2 = 0;
        int count = 0;
        do {
            int ostatok = num % 10;
            num /= 10;
            if (ostatok == 2) {
                count_2++;
            }
            count++;
        } while (lange_b >= count);
        return count_2;
    }
}
