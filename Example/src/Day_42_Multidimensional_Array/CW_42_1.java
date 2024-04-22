package Day_42_Multidimensional_Array;

import java.util.Arrays;

public class CW_42_1 {
    public static void main(String[] args) {

        int[][] arr_tringle = new int[4][];
        arr_tringle[0] = new int[2];
        arr_tringle[1] = new int[3];
        arr_tringle[2] = new int[4];
        arr_tringle[3] = new int[5];
        System.out.println(Arrays.deepToString(arr_tringle));
    }
}
