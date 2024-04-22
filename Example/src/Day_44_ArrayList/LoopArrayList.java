package Day_44_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class LoopArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

        // 1 способ с использованием обычный цикл for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // 1 способ с использованием обычный цикл for-each
        for (Integer a: list){
            System.out.print(a + " ");
        }
        System.out.println();

        for (Integer b: list){
            if (b == 4){
 //               list.remove(4); // impossible!!!
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 4){
                list.remove(Integer.valueOf(4));
            }
        }
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next == 6){
                iterator.remove();
            }
        }
        System.out.println(list);

    }
}
