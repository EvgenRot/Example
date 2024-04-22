package Day_42_Multidimensional_Array;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {

        // einfach array
        int[] arr = new int[10];
        arr[0] = 10;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1)); // print array

        // 2D array
        int[][] arr2D = new int[2][5];
        arr2D[0][0] = 2;
        arr2D[0][1] = 20;
        arr2D[0][2] = 30;
        arr2D[1][0] = 40;

        System.out.println(Arrays.deepToString(arr2D)); // print 2D array

        int[][] arr2D_2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.deepToString(arr2D_2));

        for (int i = 0; i < arr2D_2.length; i++) {
            for (int j = 0; j < arr2D_2.length; j++) {
                System.out.print(arr2D_2[i][j] + " "); // print 2D array throw loop
            }
            System.out.println();
        }

        // multiarray triangle type
        int[][] arrTringle = new int[3][];
        arrTringle[0] = new int[2];
        arrTringle[1] = new int[3];
        arrTringle[2] = new int[4];
        System.out.println(Arrays.deepToString(arrTringle));

        for (int i = 0; i < arrTringle.length; i++) {
            for (int j = 0; j < arrTringle[i].length; j++) {
                System.out.print(arrTringle[i][j] + " "); // print 2D tringle array throw loop
            }
            System.out.println();
        }

        // 3D array
        int [][][] arr_3D_ = new int[3][][];
        arr_3D_[0] = new int[2][2];
        arr_3D_[1] = new int[3][3];
        arr_3D_[2] = new int[4][4];

        System.out.println(Arrays.deepToString(arr_3D_));

        int[][][] arr_3D = {{{1, 2, 3, 4}}, {{5, 6, 7, 8}}, {{9, 10, 11, 12}}}; // add ein paar {}

        System.out.println(Arrays.deepToString(arr_3D));

        int[][][][] arr_4D = {{{{1, 2, 3, 4}}}, {{{5, 6, 7, 8}}}, {{{9, 10, 11, 12}}}}; // noch add ein paar {}

        System.out.println(Arrays.deepToString(arr_4D));

    }
}

