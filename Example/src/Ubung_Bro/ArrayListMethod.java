package Ubung_Bro;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("milch");
        food.add("hotdog");
        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.set(0, "sushi");
        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.remove(2);
        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.clear(); // clean all
        System.out.println("Clean all");
        for(int i = 0; i<food.size();i++){
            System.out.println(food.get(i));
        }
    }
}
