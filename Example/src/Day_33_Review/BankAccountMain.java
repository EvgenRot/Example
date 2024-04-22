package Day_33_Review;

import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount evgen = new BankAccount();
        evgen.setName("Evgen");
        evgen.setBalance(1000);
        evgen.setPass("111");
        System.out.println(evgen);

        startProgram("Evgen", "111", evgen);

    }

    public static void startProgram (String name, String pass, BankAccount bankAccount) {

        final var scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        System.out.print("Enter your password : ");
        pass = scanner.nextLine();
        if(name.equals(bankAccount.name) && pass.equals(bankAccount.pass)) {
            System.out.println("You have success!");
            System.out.print("What you want? \nDeposit - 1, Withdraw - 2, Transfer - 3, Esc - 4 : ");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1 : {
                    System.out.print("Enter amount deposit : ");
                    double amount = scanner.nextDouble();
                    bankAccount.deposit(amount);
                    System.out.println("Success, " + bankAccount.name + " ! Amount deposit : " + amount + "\nBalance " +
                            ": " + bankAccount.balance);
                    break;
                }
                case 2 : {
                    System.out.println("Enter amount withdraw : ");
                    double amount = scanner.nextDouble();
                    bankAccount.withDrawal(amount);
                    System.out.println("Success, " + bankAccount.name + " ! Amount withdraw : " + amount + "\nBalance" +
                            " : " + bankAccount.balance);
                    break;
                }
                default:
                    System.out.println("Falsche operation!");
                    break;

            }
        }
    }
}
