package Day_45_ArrayList_CW;

import java.util.ArrayList;
import java.util.Collections;

public class CW_45_ArrayList {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Blau");
        colors.add("Fiolet");
        System.out.println(colors);

        for(int i=0; i< colors.size();i++){
            System.out.println(colors.get(i));
        }

        colors.add(0,"Deep-Red");
        System.out.println(colors);

        System.out.println(colors.get(0));

        colors.set(0,"Braun");
        System.out.println(colors);

        colors.remove(2);
        System.out.println(colors);

        int index = colors.indexOf("Green");
        System.out.println(index);

        Collections.sort(colors);
        System.out.println(colors);

        ArrayList<String> colors1 = new ArrayList<>();
        colors1.addAll(colors); // copy in anderem List
        System.out.println(colors1);

        Collections.shuffle(colors); // mix elements ArrayList
        System.out.println(colors);

        Collections.reverse(colors);
        System.out.println(colors);

        Collections.swap(colors,0,1); // replace elements ArrayList
        System.out.println(colors);

        colors.addAll(colors1); // add in arrayList
        System.out.println(colors);


    }
}
