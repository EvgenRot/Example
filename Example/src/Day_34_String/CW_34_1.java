package Day_34_String;

public class CW_34_1 {
    public static void main(String[] args) {

        String str = "Hello World!";
        String strLowerCase = methodLowerCase(str);
        System.out.println(strLowerCase);
    }

    private static String methodLowerCase(String str) {
        String strLowerCase = str.toLowerCase();
        return strLowerCase;
    }
}
