package Day_60_FinalKeyWordAndVariableMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalArray {
    public static void main(String[] args) {

        final int[] arr1 = {1,2,3,4};               // объект объявлен финал
        System.out.println(Arrays.toString(arr1));
        arr1[0] = 5;                                //ХОТЯ! можно менять элементы в финал массиве
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {10,11,12,13};

//        arr1 = arr2;    // falue!!!               // НО! менять весь объект нельзя

        List<Integer> list = new ArrayList<>(Arrays.asList(20,21,22,23));
        list.add(1,200);
        list.remove(2);
        System.out.println("list " + list);
    }
}
