package Day_43_WrapperClasses;

public class CW_43_2 {
    public static void main(String[] args) {

        String str = "qwertyuiop[]1234567890-=asdfghjkl;'zxcvbnm,./";

        StringBuilder stringBuilder = updateToDigits(str);
        System.out.println(Integer.valueOf(stringBuilder.toString()));

        System.out.println(sumAllDigits(str));
    }

    private static int sumAllDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum = sum + Character.getNumericValue(c);
            }
        }
        return sum;
    }

    private static StringBuilder updateToDigits(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i< str.length(); i++){
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                stringBuilder.append(c);
            }
        }
        return stringBuilder;
    }
}
