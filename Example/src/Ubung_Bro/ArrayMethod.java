package Ubung_Bro;

public class ArrayMethod {
    public static void main(String[] args) {

        //strings
        String car = "Camparo";
        String car1 = new String("Mersedes");
        // arrays
        String[] cars = {"BMW", "Corwette", "Tesla"};
        cars[0] = "Mustang"; // rewrite value with index 0
        System.out.println(cars[0]);

        String[] cars1 = new String[3];
        cars1[0] = "Volga";
        cars1[1] = "Lada";
        cars1[2] = "Moskvitsch";
        for(int i = 0; i<cars1.length;i++){
            System.out.println(cars1[i]);
        }

        // 2D array = an array of array
        String [][] cars2D = {
                                {"Tesla", "Lada", "Volga"},
                                {"BMW, Mersedes", "Volvo"},
                                {"Mustang", "WV", "Opel"}
                            };
        for(int i = 0; i<cars2D.length;i++){
            System.out.println();
            for(int j = 0; j<cars2D[i].length; j++){
                System.out.print(cars2D[i][j] + " ");
            }
        }

        System.out.println();
        String [][] cars3 = new String[3][3];
        cars3[0][0] = "Camaro";
        cars3[0][1] = "Corwette";
        cars3[0][2] = "Tesla";
        cars3[1][0] = "Mustang";
        cars3[1][1] = "F-16";
        cars3[1][2] = "F-15";
        cars3[2][0] = "F-35";
        cars3[2][1] = "F-104";
        cars3[2][2] = "F-22";
        for(int i = 0; i<cars2D.length;i++){
            System.out.println();
            for(int j = 0; j<cars3[i].length; j++){
                System.out.print(cars3[i][j] + " ");
            }
        }
    }
}
