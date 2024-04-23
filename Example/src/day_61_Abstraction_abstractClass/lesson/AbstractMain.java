package day_61_Abstraction_abstractClass.lesson;

public class AbstractMain {

    public static void main(String[] args) {

        int num = 10;
        double dNum = 20.00;

        System.out.println(num);
        System.out.printf("%d %.2f %s %n",num,dNum,"Целочисленное");
        System.out.println(String.format("%d %s", num, "Целочисленное"));

    }
}
