package Day_54_StaticClassMembers2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StaticBlockClass {

    public static void main(String[] args) {

        new StaticBlockClass();
        System.out.println("StaticBlockClass.list = " + StaticBlockClass.list);
        System.out.println("StaticBlockClass.map = " + StaticBlockClass.map);
        System.out.println("Main method");
    }

    static  int a = 100;

    static ArrayList<Integer> list = new ArrayList(Arrays.asList(1,2,3,4));

    static Map<String, String> map;

    static {

        System.out.println("Static block");
        map = new HashMap<>();
        map.put("Germany", "Berlin");
        map.put("Italy", "Rom");
        map.put("Turkey", "Istanbul");
        list.add(1);
        list.add(2);
    }

    {
        System.out.println("Not static block");
    }

    public StaticBlockClass(){
        System.out.println("Constructor");
    }
}
