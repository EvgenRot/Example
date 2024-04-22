package Day_39_Arrays_2;

import java.util.Arrays;

public class CW_39_4 {
    public static void main(String[] args) {

        // копирование элементов массива в другой
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        int langeArray = intArray.length;
        int[] newArray = new int[langeArray];

        copyElementOfArray(intArray, newArray);
        System.out.println(Arrays.toString(newArray));

        int[] clon = intArray.clone();  // einfach variante Array zu kopieren
        System.out.println(Arrays.toString(clon));
    }

    private static void copyElementOfArray(int[] intArray, int[] newArray) {
        for(int i = 0; i< intArray.length; i++){
            newArray[i] = intArray[i];
        }
    }
}
