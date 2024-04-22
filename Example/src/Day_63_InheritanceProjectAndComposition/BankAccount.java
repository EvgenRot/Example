package Day_63_InheritanceProjectAndComposition;

import java.io.Serializable;

public class BankAccount implements Serializable {

    public String name;
    public String pass;
    private double currentBalance;
    private double finalBalance;
    private String accountType;
    private int accountID;
    private double returnRate;
    private double welcomeBonus;
    private double depositBonus;
    private double withdrawExpense;
    private boolean isAccountClosed;


    public BankAccount(String name, String pass, double currentBalance, double finalBalance,
                       String accountType, int accountID, double returnRate, double welcomeBonus,
                       double depositBonus, double withdrawExpense, boolean isAccountClosed) {
        this.name = name;
        this.pass = pass;
        this.currentBalance = currentBalance;
        this.finalBalance = finalBalance;
        this.accountType = accountType;
        this.accountID = accountID;
        this.returnRate = returnRate;
        this.welcomeBonus = welcomeBonus;
        this.depositBonus = depositBonus;
        this.withdrawExpense = withdrawExpense;
        this.isAccountClosed = isAccountClosed;
    }

    public BankAccount() {

    }

    public void deposit(double depositvalue) {
        this.currentBalance += depositvalue;
    }

    public void withdraw(double withdrawValue) {
        this.currentBalance -= withdrawValue;
    }

    public void closeAccount(){
        if (isAccountClosed){
            System.out.println("Вы уже закрыли свой счет");
        }else {
            System.out.println("!!!!!!Идет процесс закрытия вашего счета!!!!!! " + getAccountType());
            System.out.println("Ваш конечный баланс с процентами " + getFinalBalance());
            this.currentBalance = 0;
            this.isAccountClosed = true;
            System.out.println("Успешно закрыто ваш счет " + getAccountType());
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(double finalBalance) {
        this.finalBalance = finalBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public double getReturnRate() {
        return returnRate;
    }

    public void setReturnRate(double returnRate) {
        this.returnRate = returnRate;
    }

    public double getWelcomeBonus() {
        return welcomeBonus;
    }

    public void setWelcomeBonus(double welcomeBonus) {
        this.welcomeBonus = welcomeBonus;
    }

    public double getDepositBonus() {
        return depositBonus;
    }

    public void setDepositBonus(double depositBonus) {
        this.depositBonus = depositBonus;
    }

    public double getWithdrawExpense() {
        return withdrawExpense;
    }

    public void setWithdrawExpense(double withdrawExpense) {
        this.withdrawExpense = withdrawExpense;
    }

    public boolean isAccountClosed() {
        return isAccountClosed;
    }

    public void setAccountClosed(boolean accountClosed) {
        isAccountClosed = accountClosed;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", currentBalance=" + currentBalance +
                ", finalBalance=" + finalBalance +
                ", accountType='" + accountType + '\'' +
                ", accountID=" + accountID +
                ", returnRate=" + returnRate +
                ", welcomeBonus=" + welcomeBonus +
                ", depositBonus=" + depositBonus +
                ", withdrawExpense=" + withdrawExpense +
                ", isAccountClosed=" + isAccountClosed +
                '}';
    }
}
class BankAccountPublicData {
    public String name;
    public double balance;

    public BankAccountPublicData(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}

