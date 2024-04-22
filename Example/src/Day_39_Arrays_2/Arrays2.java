package Day_39_Arrays_2;

import java.util.Arrays;

public class Arrays2 {
    public static void main(String[] args) {

        int[] array = new int[10];
        double [] dArray = new double[2];
        short [] sArray = new short[3];
        String [] strArray = new String[3];
        Houses [] houses = new Houses[3];
        Houses [] houses1 = {new Houses(1,"Kiev"), new Houses(2, "Madrid")};
        Houses houses2 = houses1[0];
        System.out.println(Arrays.toString(houses1)); // main variant to print
        for(int i =0;i<houses1.length; i++){
            System.out.println(houses1[i]);     // second variant to print
        }
    }
}
 class Houses {
    public  int window;
    public  String adress;

     public Houses(int window, String address) {
         this.window = window;
         this.adress = address;
     }

     @Override
     public String toString() {
         return "Houses{" +
                 "window=" + window +
                 ", address='" + adress + '\'' +
                 '}';
     }
 }