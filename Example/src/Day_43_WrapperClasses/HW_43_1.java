package Day_43_WrapperClasses;

public class HW_43_1 {
    public static void main(String[] args) {

        String str = "qwrwer123sdfg456,./7890][][][][]";
        System.out.println("Digitals : " + updateToDigits(str));
        System.out.println("Summa : " + sumToDigits(str));
    }

    private static int sumToDigits(String str) {
        char[] chars = str.toCharArray(); // перевод строки в array
        int sum = 0;
        for(int i=0; i<chars.length;i++){
            if(Character.isDigit(chars[i])){
                sum = sum + Integer.parseInt(String.valueOf(chars[i]));
            }
        }
        return sum;
    }

    private static int updateToDigits(String str) {
        char[] chars = str.toCharArray(); // перевод строки в array
        str = "";
        for(int i=0; i<chars.length;i++){
            if(Character.isDigit(chars[i])){
                str = str + chars[i];
            }
        }
        return Integer.parseInt(str);
    }
}
