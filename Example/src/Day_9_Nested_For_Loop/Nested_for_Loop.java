package Day_9_Nested_For_Loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Nested_for_Loop {
    public static void main(String[] args) {

        // Вывод факториала от 1 до 10 (3!= 1*2*3)
        for (int j = 1; j <= 10; j++) {
            int result = 1;
            for (int i = 1; i <= j; i++) {
                result *= i;
            }
            System.out.println(result);
        }

// ПОИСК И ЗАМЕНА В ARRAYLIST С ПОМОЩЬЮ ITERATOR

        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("one and a half");
        stringList.add("two");
        stringList.add("two and a half");
        stringList.add("three and a half");
        stringList.add("four");

        System.out.println("Before " + stringList);

 //       Iterator<String> stringIterator = stringList.iterator();
       ListIterator<String> stringIterator = stringList.listIterator(); // можно и более мощный
        while (stringIterator.hasNext()) {
            String next = stringIterator.next();
            if (next.equals("two and a half")) {	// поиск
                int indexArrayList = stringList.indexOf(next);
                ArrayList<String> list2 = new ArrayList<>();    //создание list 2
                list2.add("three");
                stringList.addAll((indexArrayList + 1), list2);    //вставка
                break;
            }
        }
        System.out.println("After  " + stringList);
    }
}
