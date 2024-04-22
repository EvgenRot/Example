package Day_39_Arrays_2;

public class CW_39_3 {
    public static void main(String[] args) {

        // метод возвращает индекс элемента в массиве, если нет, выводит -1
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int controlInt = 8;
        System.out.println(returnIndex(intArray, controlInt));
    }

    private static int returnIndex(int[] intArray, int controlInt) {
        for(int i = 0; i< intArray.length; i++){
            if(intArray[i]== controlInt){
                return i;
            }
        }
        return -1;
    }
}
