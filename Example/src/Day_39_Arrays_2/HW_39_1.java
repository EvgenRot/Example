package Day_39_Arrays_2;

public class HW_39_1 {
    public static void main(String[] args) {


        int[] array = {11,2,7,4,10,23,3,5};
//        int max = array[0];
//        int min = array[0];

//        findMaxMin(array, max, min);
    }

    private static void findMaxMin(int[] array, int max, int min) {
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) max = array[i];
            if(min > array[i]) min = array[i];
        }
        System.out.println();
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
