package Day_44_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListMethods {
    public static void main(String[] args) {

        // first variant building ArrayList
        ArrayList<Integer> list0 = new ArrayList<>();
        list0.add(1);
        list0.add(2);
        list0.add(3);
        list0.add(1);
        System.out.println(list0);

        //second variant
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1","2","3"));
        list.add("Volvo");
        list.add("BMW");
        list.add("Volvo");
        list.add("BMW");
        list.add("Volvo");
        list.add("BMW");
        System.out.println(list);

        //доступ к элементам
        String volvo = list.get(3);
        System.out.println(volvo);
        System.out.println(list.get(4));

        //изменение элементов ArrayList
        list.set(4, "Opel");
        System.out.println(list);

        // delete elements ArrayList (only first element!!!)
        list.remove(0);
        list.remove("Volvo");
        System.out.println(list);

        //delete all elements
        list.removeAll(Collections.singleton("Volvo"));
        System.out.println(list);

        // получение размера листа
        System.out.println(list.size());

        // methods indexOf(), lastIndexOf()
        System.out.println(list.indexOf("BMW"));
        System.out.println(list.indexOf("Волга"));
        System.out.println(list.lastIndexOf("BMW"));

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2,3,4,5,1,1,1,1,6,7,8));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(7,6,5,4,3,2,1));
        ArrayList<String> list4 = new ArrayList<>(Arrays.asList("1","1","1","2","3","4","5","1","1","6","7","8"));

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list3)); //false

        System.out.println(list1.contains(list3));

        Collections.sort(list3);  // sort ArrayList

        System.out.println(list3);
        System.out.println(list1.equals(list3)); // true

        list2.retainAll(list3); // print equel digits
        System.out.println(list2);

        List<Integer> collect = list2.stream().distinct().collect(Collectors.toList());
        System.out.println("Stream " + collect);

        list2.removeAll(Collections.singletonList(Integer.valueOf(1)));
        list4.removeAll(Collections.singleton(String.valueOf("1")));
        System.out.println(list2);
        System.out.println(list4);
        list2.removeAll(list3); // print unique digits
        System.out.println(list2);

        //clear ArrayList
        list.clear();
        System.out.println(list);
    }
}
