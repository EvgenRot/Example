package Ubung_Bro;

import java.util.ArrayList;

public class ArrayLists2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("milch");
        food.add("hotdog");

        ArrayList<String> food2 = new ArrayList<String>();
        food2.add("tomate");
        food2.add("zuckini");
        food2.add("gurcke");

        ArrayList<String> food3 = new ArrayList<String>();
        food3.add("Cola");
        food3.add("Pepsi");
        food3.add("Fanta");

        groceryList.add(food);
        groceryList.add(food2);
        groceryList.add(food3);

        System.out.println(groceryList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));

    }
}
