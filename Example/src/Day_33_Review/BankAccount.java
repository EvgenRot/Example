package Day_33_Review;

public class BankAccount {

    public double balance;
    public String name;
    public String pass;

    public BankAccount(double balance, String name, String pass) {
        this.balance = balance;
        this.name = name;
        this.pass = pass;
    }

    public BankAccount() {

    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("You put your money at account, balance : " + balance);
    }

    public void withDrawal(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Not enouth money!");
            System.out.println("Your balance : " + balance);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}

