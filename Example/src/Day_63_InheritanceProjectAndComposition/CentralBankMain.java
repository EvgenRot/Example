package Day_63_InheritanceProjectAndComposition;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CentralBankMain {

    static List<CentralBank> banks = new ArrayList();

    public static void main(String[] args) {
        // Bank Account Simulator
        // check the presence of the data file and if it is not there, create it
        String fileName = "test.json";
        File file = new File(fileName);
        createNewFile(file);

        // if the file is empty, set arbitrary initial conditions
        if (file.length() == 0) {
            beginData();
        } else {
            readData(fileName);
        }
        System.out.println("Hello!");
        for (CentralBank bank : banks) {
            bank.debugPrintAvailablePersons();
        }
        int user_account = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your accountID: ");
            user_account = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter pass");
            String pass_new = scanner.nextLine();

            // select data from the array by username
            BankAccountPublicData user = null;
            CentralBank bankSelected = null;
            for (CentralBank bank : banks) {
                user = bank.tryGetUserWithCredentials(user_account, pass_new);
                if (user != null) {
                    bankSelected = bank;
                    break;
                }
            }
            if (user != null) {
                System.out.println("Welcome, " + user.getName());
                System.out.println("Your balance " + user.getBalance());
                System.out.println("Withdraw or deposit cash? \n 1- Withdraw, " +
                        "2 - Deposit, 3 - Transfer to another account, 4 - Close account, Any other - Cancel");
                alarmData(scanner);
                int operation = scanner.nextInt();
                switch (operation) {
                    case 1: {
                        System.out.println("Enter withdrawal amount: ");
                        alarmData(scanner);
                        int amount = scanner.nextInt();
                        bankSelected.withdraw(user_account, amount);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter deposit amount: ");
                        alarmData(scanner);
                        int amount = scanner.nextInt();
                        bankSelected.deposit(user_account, amount);
                        break;
                    }
                    case 3: {
                        System.out.println("Enter the transfer amount: ");
                        alarmData(scanner);
                        int amount = scanner.nextInt();
                        CentralBank bankTransferSelected = null;
                        int transfer = 0;
                        while (true) {
                            System.out.println("Specify the recipient's account: ");
                            alarmData(scanner);
                            transfer = scanner.nextInt();

                            // select from the data array by user account

                            for (CentralBank bank : banks) {
                                if (bank.exists(transfer)) {
                                    bankTransferSelected = bank;
                                    break;
                                }
                                ;
                            }
                            if (bankTransferSelected != null) {
                                break;
                            }
                            System.out.println("Invalid account!");
                        }
                        if (bankSelected.withdraw(user_account, amount)) {
                            bankTransferSelected.deposit(transfer, amount);
                            System.out.println("Transfer " + amount + " to account " + transfer);
                        }
                        break;
                    }
                    case 4: {
                        bankSelected.closeAccount(user_account);
                        break;
                    }
                }
            } else {
                System.out.println("Invalid accountID or pass!");
            }
            System.out.println("Finish work? Yes - 1  No - 2 ");
            byte end_job = scanner.nextByte();
            if (end_job == 1) {
                break;
            }
        }
        writeData(fileName);
    }

    private static void createNewFile(File file) {

        try {
            if (file.createNewFile()) {
                System.out.println("File created");
            }
        } catch (IOException e) {
            System.out.println("Error creating file");
            e.printStackTrace();
        }
    }

    private static void beginData() {

        CityGroup bank1 = new CityGroup("City Group");
        SberBank bank2 = new SberBank("Sber Bank");

        System.out.println("User ID = " + bank1.createUserAccount("Oleg", "111", "GOLD"));
        System.out.println("User ID = " + bank1.createUserAccount("Denis", "222", "SAVING"));
        System.out.println("User ID = " + bank2.createUserAccount("Anna", "333", "INTEREST"));
        System.out.println("User ID = " + bank2.createUserAccount("Eugen", "444", "GOLD"));

        banks.add(bank1);
        banks.add(bank2);

    }

    private static void writeData(String fileName) {

        //writing new data to the binary file after finishing work
        try {
            FileOutputStream a = new FileOutputStream(fileName);
            ObjectOutputStream b = new ObjectOutputStream(a);
            b.writeObject(banks);
            b.flush();
            b.close();
            a.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    private static void readData(String fileName) {

        // reading data from a binary file
        try (final FileInputStream FileOutputStream = new FileInputStream(fileName);
             final ObjectInputStream ObjectInputStream = new ObjectInputStream(FileOutputStream)) {
            banks = (List<CentralBank>) ObjectInputStream.readObject();
            System.out.println(banks.toString());
        } catch (final IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    private static void alarmData(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            System.out.println("You are entering incorrect data!");
            scanner.next();
        }
    }
}
