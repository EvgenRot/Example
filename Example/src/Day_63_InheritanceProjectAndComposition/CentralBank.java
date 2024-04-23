package Day_63_InheritanceProjectAndComposition;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public abstract class CentralBank implements ICentralBank, Serializable {

    protected List<BankAccount> accounts = new ArrayList();
    private String bankName;
    private static int currentUserID = 10000;

    public CentralBank(String bankName) {
        this.bankName = bankName;
    }

    public int createUserAccount(String name, String pass, String accountType) {

        int accountID = currentUserID;
        currentUserID ++; // currentUserID should be unique
        BankAccount person = new BankAccount();
        person.setName(name);
        person.setPass(pass);
        person.setAccountType(accountType);
        person.setAccountID(accountID);
        setupUserAccountType_impl(person);
        accounts.add(person);
        return accountID;
    }

    public void deposit(int accountID, double depositvalue) {
        BankAccount person = getUserByID(accountID);
        if (person == null) {
            System.out.println("User not found");
            return;
        } else if(person.isAccountClosed()) {
            System.out.println("Account closed");
            return;
        }
        deposit_impl(person, depositvalue);
        System.out.println("Balance on your account: " + person.getCurrentBalance());
    }


    public boolean withdraw(int accountID, double withdrawValue) {

        BankAccount person = getUserByID(accountID);
        if (person == null) {
            System.out.println("User not found");
            return false;
        } else if(person.isAccountClosed()) {
            System.out.println("Account closed");
            return false;
        }
        boolean result = withdraw_impl(person, withdrawValue);
        System.out.println("Balance on your account: " + person.getCurrentBalance());
        return result;
    }

    public void closeAccount(int accountID) {
        BankAccount person = getUserByID(accountID);
        if (person == null) {
            System.out.println("User not found");
            return;
        } else if(person.isAccountClosed()) {
            System.out.println("Account closed");
            return;
        }
        System.out.println("Starting of closing account");
        System.out.println("Balance on your account: " + person.getCurrentBalance());
        deposit(accountID,person.getCurrentBalance() * (person.getReturnRate() - 1.0));
        System.out.println("Balance with percent(%): " + person.getCurrentBalance());
        withdraw(accountID,person.getCurrentBalance());
        person.closeAccount();
    }

    protected BankAccount getUserByID(int accountID) {
        ListIterator<BankAccount> iterator = accounts.listIterator();
        while (iterator.hasNext()) {
            BankAccount person = iterator.next();
            if (person.getAccountID() == accountID) {
                return person;
            }
        }
        return null;
    }

    public final BankAccountPublicData tryGetUserWithCredentials(int accountID, String pass) {
        BankAccount person = getUserByID(accountID);
        if (person == null) {
            return null;
        }
        if (person.getPass().equals(pass)) {
            BankAccountPublicData personPublicData = new BankAccountPublicData(person.getName(),
                    person.getCurrentBalance());
            return personPublicData;
        }
        System.out.println("Invalid pass!");
        return null;
    }

    public boolean exists(int accountID) {
        BankAccount person = getUserByID(accountID);
        if (person == null) {
            return false;
        }
        return true;
    }
    public void debugPrintAvailablePersons(){
        for (BankAccount person : accounts) {
            if (!person.isAccountClosed()) {
                System.out.println("Account: " + person.getAccountID() +
                        ", User: " + person.getName() + ", pass: " + person.getPass());
            }
        }
    }
}