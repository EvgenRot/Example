package Day_49_Encapsulation;

public class Bank {
    public static void main(String[] args) {

        BankAccount oleg = new BankAccount();
        BankAccount eugen = new BankAccount("Eugen", 2000, "11111111");
        oleg.setName("Oleg");
        oleg.setBalance(1000);
        oleg.setAccountType("22222222");

        oleg.displayBalance();
        eugen.displayBalance();

        System.out.println(oleg);
        System.out.println(eugen);
    }

    public static class BankAccount{
        public String name;
        public double balance;
        public String accountType;

        public BankAccount(String name, double balance, String accountType) {
            this.name = name;
            this.balance = balance;
            this.accountType = accountType;
        }

        public BankAccount() {

        }

        public void displayBalance(){
            System.out.println(name + " your balance " + balance);
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getAccountType() {
            return accountType;
        }

        public void setAccountType(String accountType) {
            this.accountType = accountType;
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "name='" + name + '\'' +
                    ", balance=" + balance +
                    ", accountType='" + accountType + '\'' +
                    '}';
        }
    }
}
