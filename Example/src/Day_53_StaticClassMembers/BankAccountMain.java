package Day_53_StaticClassMembers;

import java.time.LocalDate;

public class BankAccountMain{

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        System.out.println("account1.calculateInterest(0.05) = " + account1.calculateInterest(0.05));
        System.out.println("account2.calculateInterest(0.05) = " + account2.calculateInterest(0.05));

        System.out.println("Summa % = " + BankAccount.getTotalInterestEarned());

        System.out.println(account1.getTotalInterestEarned()); // oder, aber besser es macht nicht

        System.out.println("===================================================");

        System.out.println("CurrencyConverter.USD_TO_EUR_RATE = " + CurrencyConverter.USD_TO_EUR_RATE);
        double amountInUSD = 100.0;
        double amountInEUR = CurrencyConverter.convertToEUR(amountInUSD);
        double amountInJPY = CurrencyConverter.convertToJPY(amountInUSD);
        System.out.printf("%s USD эквивалентно (на %s):%n%s EUR%n%s JPY",
                amountInUSD, LocalDate.now(), amountInEUR, amountInJPY);
    }
}

class BankAccount {

    private double balance;
    private static double totalInterestEarned = 0.0;

    public BankAccount(double initial_balance) {
        this.balance = initial_balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance>=amount){
            balance -= amount;
        }else{
            System.out.println("Not enough money");
        }
    }
    public double calculateInterest(double rate){
        double interest = balance * rate;
        totalInterestEarned += interest;
        balance += interest;
        return interest;
    }

    public static double getTotalInterestEarned() {
        return totalInterestEarned;
    }
}
 class CurrencyConverter {
    public static final double USD_TO_EUR_RATE = 0.92;
    private static final double USD_TO_JPY_RATE = 146.35;

    public static double convertToEUR(double amountInUSD) {
        return amountInUSD * USD_TO_EUR_RATE;
    }

    public static double convertToJPY(double amountInUSD) {
        return amountInUSD * USD_TO_JPY_RATE;
    }
}
