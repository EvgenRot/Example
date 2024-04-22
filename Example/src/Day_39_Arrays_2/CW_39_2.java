package Day_39_Arrays_2;

public class CW_39_2 {
    public static void main(String[] args) {

        // вывод true, если  найден элемент массива, если нет - false
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int controlInt = 4;

        String[] strings = {"Dog", "Cat", "Bird"};

        String str = "AABBCCDDEEFF";
        char[] chars = new char[str.length()];

        for(int i = 0; i< str.length();i++){
            chars[i] = str.charAt(i); // переводим строку в массив символов
            System.out.print(chars[i] + " ");
        }
        System.out.println();

        System.out.println(contains(intArray, controlInt));
        System.out.println(contains(strings, "Bird"));
    }

    private static boolean contains(int[] intArray, int controlInt) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == controlInt) {
                return true;
            }
        }
        return false;
    }
    private static boolean contains(String[] intArray, String controlInt) {

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == controlInt) {
                return true;
            }
        }
        return false;
    }
}
