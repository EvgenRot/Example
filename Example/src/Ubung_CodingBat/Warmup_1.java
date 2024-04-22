package Ubung_CodingBat;

import java.util.Arrays;

public class Warmup_1 {
    public static void main(String[] args) {

//        boolean negative;
//        int a, b;
//        int n = 4;
//        String str = "a";
//        String middle = "";
//        String end = "";
//        String begin = "";
//        if (str.length() > 1) {
//            begin = str.substring(str.length() - 1, str.length());
//            middle = str.substring(1, str.length() - 1);
//            end = str.substring(0, 1);
//        } else if (str.length() == 1) {
//            begin = str.substring(str.length() - 1, str.length());
//        } else {
//            System.out.println(str);
//        }

        //       System.out.println(begin+middle+end);

        //       System.out.println(backAround([1,2,6]))

        int[] nums = {1, 3};
//        int[] a5 = {1};
//        int[] b5 = {2};
//        int a3 = nums[nums.length - 1];


        System.out.println(has23(nums));

//        System.out.println(Arrays.toString(sleepIn(nums)));

//        int a1 = nums.length;
//        if (a1 > 1) {
//            if (nums[0] == 1 && nums[a1 - 1] == 1) {
//                System.out.println(true);
//            }
//        } else if (a1 == 1 && nums[0] == 1) {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

    }

    public static int[] sleepIn(int[] nums) {
        int[] arr = new int[3];
        if (nums.length > 1) {
            if (nums[0] > nums[2]) {
                arr[0] = nums[2];
            } else {
                arr[2] = nums[0];
            }
        }
        return arr;
    }

    public static boolean has23(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] ==3) {
                return false;
            }
        }
        return true;
    }
}

