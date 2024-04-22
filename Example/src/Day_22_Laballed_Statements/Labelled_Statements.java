package Day_22_Laballed_Statements;

public class Labelled_Statements {
    public static void main(String[] args) {

        // break  - прерывает выполнение цикла

        int count = 0;
        while (count < 10) {
            if (count == 5) {
                break;
            }
            System.out.println("Count = " + count);
            count++;
        }
        System.out.println("Alles!");

        // continue - пропускает выполнение цикла
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i = " + i);
        }

        if (true) {
            System.out.println("======");
            System.out.println("111111");
            System.out.println("222222");
            System.out.println("333333");
            System.out.println("444444");
            System.out.println("555555");
            System.out.println("======");
        }


    }
}
