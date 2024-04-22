package Day_29_Class_Objects;

import java.util.Scanner;

public class HW_29_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательно через Enter наименование товара, " +
                "его цену и количество. Закончить работу - 0");
        double summaTotal = 0;

        while (true) {
            System.out.print("Name - ");
            String name = scanner.next();
            if (!(name.equals("0"))) {
                System.out.print("Price - ");
                double price = scanner.nextDouble();
                System.out.print("Amount - ");
                double amount = scanner.nextDouble();
                Produkt produkt = new Produkt(name, price, amount);
                System.out.println(produkt + "\nSumma " + produkt.name + " is " + produkt.summaProdukt());
                summaTotal = getSummaTotal(summaTotal, produkt);
            } else {
                System.out.println("Total summa = " + summaTotal);
                System.out.println("Work ended");
                break;
            }
        }
    }

    private static double getSummaTotal(double summaTotal, Produkt produkt) {
        summaTotal = summaTotal + produkt.summaProdukt();
        return summaTotal;
    }
}

