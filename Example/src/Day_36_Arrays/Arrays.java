package Day_36_Arrays;

public class Arrays {
    public static void main(String[] args) {

        int[] myArray; // besser
        int myArray1[] = new int[10]; // 2-th variant to prefer array
        double[] dArray;
        byte[] bArray = new byte[3];
        boolean[] booleansArray = new boolean[2];
        String[] car = new String[3];
        House[] houses;

        // Building Array

        myArray = new int[10];
        dArray = new double[5];
        houses = new House[7];

        House house1 = new House(4,"Kiev");
        House house2 = new House(3, "Berlin");
        House house3 = new House(2,"Madrid");

        House[] houses_new = new House[3];

        houses_new[0] = house1;
        houses_new[1] = house2;
        houses_new[2] = house3;

        System.out.println(java.util.Arrays.toString(houses_new));

        for(int i = 0; i< houses_new.length; i++){
            System.out.println(houses_new[i]);
        }

        int summa = 0;
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};

        for(int i =0; i<intArray.length;i++){
            summa = summa + intArray[i];
            System.out.print(intArray[i] + " "); // print all element array
        }
        System.out.println("\n" + summa);

        int[] result = new int[intArray.length];
        for(int i = intArray.length-1, j = 0; i>=0; i--, j++){ // excises multi-prepare for
            result[j] = intArray[i];
            System.out.print(result[j] + " ");  // reverse array
        }

        System.out.println();
        String[] cars = {"Volvo", "VAZ", "Mercedes"};
        for(int i = 0; i< cars.length;i++){
            if(cars[i] == "Volvo"){
                cars[i] = "Audi";           // we can change date in array
            }
            System.out.print(cars[i] + " "); // print array throw loop for
        }

        System.out.println();
        String[] cars1 = {"Volvo", "VAZ", "Mercedes"};
        for (String c : cars1) {
            if(c.equals("VAZ")){
               break;
            }
            System.out.print(c + " "); // loop for-each
        }
        System.out.println("\n" + cars.length); // Dlina array

        String str = "Hallo, Welt!";
        char[] chars = str.toCharArray(); // перевод строки в массив
        System.out.println(java.util.Arrays.toString(chars));

    }
}
 class House {

    int window;
    String adress;

     public House(int window, String adress) {
         this.window = window;
         this.adress = adress;
     }

     @Override
     public String toString() {
         return "House{" +
                 "window=" + window +
                 ", adress='" + adress + '\'' +
                 '}';
     }
 }
