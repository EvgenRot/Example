package Day_22_Laballed_Statements;

public class LabelLesson {
    public static void main(String[] args) {
        // метки in: und out:

        out:
        for(int i=1; i<=10; i++){
            System.out.println("Внешний цикл " + i);
            System.out.println("==================");
            in:
            for(int j=1; j<=10; j++){
                System.out.println("Внутренний цикл " + j);
                if (j==2){
                    break out;
                }
            }
        }
    }
}
