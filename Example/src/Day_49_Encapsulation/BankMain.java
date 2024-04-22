package Day_49_Encapsulation;

public class BankMain {
    public static void main(String[] args) {

        Bank oleg = new Bank();
        oleg.setAccountID(12345);  // проверка на 5 цифровый айди
        oleg.setCountType("Usd");   // проверка на тип валюты

    }

    public static class Bank {

        public String name;
        public int accountID;
        public String countType;
        public double balance;

        public Bank(String name, int accountID, String countType, double balance) {
            this.name = name;
            this.accountID = accountID;
            this.countType = countType;
            this.balance = balance;
        }

        public Bank() {

        }
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAccountID() {
            return accountID;
        }

        public void setAccountID(int accountID) {
            if(String.valueOf(accountID).length()==5){
                this.accountID = accountID;
                System.out.println("Your account - " + accountID);
            }
        }

        public String getCountType() {
            return countType;
        }

        public void setCountType(String countType) {
            if(countType.toLowerCase().equals("euro") || countType.toLowerCase().equals("usd")){
                this.countType = countType;
                System.out.println("Type Account - " + countType);
            }else {
                System.out.println("Account not right!");
            }
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }
}
