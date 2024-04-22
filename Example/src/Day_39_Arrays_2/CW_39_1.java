package Day_39_Arrays_2;

public class CW_39_1 {
    public static void main(String[] args) {

        // сумма элементов массива и вывод среднего значения
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int summa = 0;

        summa = getSumma(intArray, summa);
        System.out.println("Summa : " + summa);
        System.out.println("Среднее число : " + summa/ intArray.length);
    }

    private static int getSumma(int[] intArray, int summa) {
        for(int i = 0; i< intArray.length; i++){
            summa = summa + intArray[i];
        }
        return summa;
    }
}
