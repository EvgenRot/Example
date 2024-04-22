package Ubung_Bro;

import java.util.ArrayList;

public class Loop_For_Each {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "bird", "snake"};
        for(String i : animals){
            System.out.println(i);
        }
        ArrayList<String> animals1 = new ArrayList<String>();
        animals1.add("cat");
        animals1.add("dog");
        animals1.add("bird");
        animals1.add("snake");
        for(String i : animals1) {
            System.out.println(i);
        }

    }
}
