package Day_7_Practik;

import java.util.Scanner;

public class Primer_switch_case {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("nomer mounth :");
        int mes = scanner.nextInt();

        switch (mes) {
            case 3, 4, 5:
                System.out.println("Fruling");
                break;
            case 6, 7, 8:
                System.out.println("Sommer");
                break;
            case 9, 10, 11:
                System.out.println("Herbst");
                break;
            case 1, 2, 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Nein");
        }
    }
}

