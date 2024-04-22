package Day_22_Laballed_Statements;

public class Class_Work_12 {
    public static void main(String[] args) {

        for (int i = 10; i <= 20; i +=2) {
            if (i == 16) {
                continue;
            }
            System.out.println("i = " +i);
        }
        System.out.println("==================");

        for (int i = 10; i <=20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            if (i == 16) {
                continue;
            }
            System.out.println("i = " + i);
        }
        System.out.println("=============");

        // с бесконечным циклом с использованием break und continue
        for (int i = 10; ; i++) {
            if (i % 2 == 1) {
                continue;
            }
            if (i == 16) {
                continue;
            }
            if (i > 20) {
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("================");

        int i = 9;
        while (true){
            i++;
            if (i % 2 == 1) {
                continue;
            }
            if (i == 16) {
                continue;
            }
            if (i > 20) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
