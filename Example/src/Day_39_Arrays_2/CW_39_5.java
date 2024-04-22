package Day_39_Arrays_2;

import java.util.Arrays;

public class CW_39_5 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7,8,9,10};
        int newInt = 10;
        int index = 5;

        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        newArray[index] = newInt;
        for (int i = index; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }
        System.out.println(Arrays.toString(newArray));

        System.out.println(Arrays.toString(insertItemToIndex(arr,5,10)));
    }

    // variant Bulats

    static int[] insertItemToIndex(int[] array, int index, int item){
        int[] new_array = new int[array.length+1];
        for(int i = 0; i< array.length; i++){
            if(i<index){
                new_array[i] = array[i];
            } else if (i==index) {
                new_array[i] = item;
            }else {
                new_array[i] = array[i-1];
            }
            new_array[i+1] = array[i];
        }
        return new_array;
    }

}
