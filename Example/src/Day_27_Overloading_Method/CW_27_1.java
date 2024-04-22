package Day_27_Overloading_Method;

public class CW_27_1 {
    public static void main(String[] args) {

        int a, b;
        System.out.println(lastDigit(25, 25));
        System.out.println(lastDigit(9, 118));
        System.out.println(lastDigit(3, 2793));
    }

    private static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
