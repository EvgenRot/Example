package Day_39_Arrays_2;

import java.util.Arrays;
import java.util.HashMap;

public class Example {
    public static void findStringDuplicate(String[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или нулевым");
        }

        HashMap<String, Integer> countMap = new HashMap<>();
        for (String str : array) {
            if (countMap.containsKey(str)) {
                countMap.put(str, countMap.get(str) + 1);
            } else {
                countMap.put(str, 1);
            }
        }

        System.out.println("Повторяющиеся элементы в массиве:");
        for (String str : countMap.keySet()) {
            if (countMap.get(str) > 1) {
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        String[] array = {"eio", "rfgh", "tliu", "yjh", "er", "rfgh", "eio" ,"eio","eio","eio"};

        findStringDuplicate(array);
    }

}
