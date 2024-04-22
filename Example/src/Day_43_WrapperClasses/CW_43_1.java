package Day_43_WrapperClasses;

public class CW_43_1 {
    public static void main(String[] args) {

        int integer = 1234567;
        String str = convertToString(integer);
        System.out.println(str);
    }

    private static String convertToString(int integer) {
        String str = String.valueOf(integer);
        return str;
    }
}
