package Day_44_ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class CW_44_1_Random_uniqueDigits {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i<10;i++){
            list.add(random.nextInt(10));
        }
        System.out.println(list);
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            if(list.indexOf(list.get(i))!= list.lastIndexOf(list.get(i))&&!duplicateList.contains(list.get(i))){
                duplicateList.add(list.get(i));
            }
        }
        System.out.println(duplicateList);

        // second variant with foreach
        for (Integer element : list) {
            if(list.indexOf(element) != list.lastIndexOf(element) && !duplicateList.contains(element)){
                duplicateList.add(element);
            }
        }
        System.out.println(duplicateList);
    }
}
