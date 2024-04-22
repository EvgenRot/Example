package Example;
import java.io.*;
import java.util.*;

public class Bankomatik {
    static List<Person> users = new ArrayList<>();

    public static void main(String[] args) {

        // ATM Simulator
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
        String user_name = "";
        String user_pass = "";
        int user_balance = 0;
        int user_account = 0;
        String transfer_name = "";
        String transfer_pass = "";
        int transfer_balance = 0;
        int transfer_account = 0;

        byte d = 1;
        while (d == 1) {
            System.out.println("Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            String name_new = scanner.nextLine();

            // select data from the array by username
            for (Person user : users) {
                if (user.getName().equals(name_new)) {
                    user_name = user.getName();
                    user_pass = user.getPass();
                    user_balance = user.getBalance();
                    user_account = user.getAccount();
                }
            }
            if (name_new.equals(user_name)) {
                System.out.println("Enter pass");
                String pass_new = scanner.nextLine();
                if (pass_new.equals(user_pass)) {
                    System.out.println("Welcome, " + user_name);
                    System.out.println("Your balance " + user_balance);
                    System.out.println("Withdraw or deposit cash? \n 1- Withdraw, " +
                            "2 - Deposit, 3 - Transfer to another account, 4 - Cancel");
                    int operation = scanner.nextInt();
                    switch (operation) {
                        case 1: {
                            System.out.println("Enter withdrawal amount: ");
                            alarmData(scanner);
                            int amount = scanner.nextInt();
                            if (user_balance >= amount) {
                                user_balance -= amount;
                                changeData(users, user_name, user_pass, user_balance, user_account);
                            } else {
                                System.out.println("Not enough money to withdraw cash!");
                            }
                            System.out.println("Balance on your account: " + user_balance);
                            break;
                        }
                        case 2: {
                            System.out.println("Enter deposit amount: ");
                            alarmData(scanner);
                            int amount = scanner.nextInt();
                            user_balance += amount;
                            changeData(users, user_name, user_pass, user_balance, user_account);
                            System.out.println("Balance on your account: " + user_balance);
                            break;
                        }
                        case 3: {
                            System.out.println("Enter the transfer amount: ");
                            alarmData(scanner);
                            int amount = scanner.nextInt();
                            System.out.println("Specify the recipient's account: ");
                            alarmData(scanner);
                            int transfer = scanner.nextInt();

                            // select from the data array by user account
                            for (Person user : users) {
                                if (user.getAccount() == (transfer)) {
                                    transfer_name = user.getName();
                                    transfer_pass = user.getPass();
                                    transfer_balance = user.getBalance();
                                    transfer_account = user.getAccount();
                                }
                            }
                            if (transfer == (transfer_account)) {
                                if (user_balance >= amount) {
                                    user_balance -= amount;
                                    transfer_balance += amount;

                                    changeData(users, user_name, user_pass, user_balance, user_account);
                                    changeData(users, transfer_name, transfer_pass, transfer_balance, transfer_account);

                                    System.out.println("Balance on your account: " + user_account + " " + user_balance);
                                    System.out.println("Balance on account: " + transfer_name + " "
                                            + transfer_account + " " + transfer_balance);
                                } else {
                                    System.out.println("There is not enough money for the operation!");
                                }
                            } else {
                                System.out.println("Invalid account!");
                            }
                            break;
                        }
                        case 4 : {
                            System.out.println("Balance on your account: " + user_balance);
                            break;
                        }
                    }
                } else {
                    System.out.println("Invalid pass!");
                }
            } else {
                System.out.println("Invalid login!");
            }
            System.out.println("Finish work? Yes - 1  No - 2 ");
            byte end_job = scanner.nextByte();
            if (end_job == 1) {
                d = 0;
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

        Person person1 = new Person("Oleg", "111", 1000, 11111);
        Person person2 = new Person("Bulat", "222", 100, 22222);
        Person person3 = new Person("Eugen", "333", 0, 33333);
        Person person4 = new Person("Igor", "444", 0, 44444);
        Person person5 = new Person("Anna", "555", 0, 55555);

        users.add(person1);
        users.add(person2);
        users.add(person3);
        users.add(person4);
        users.add(person5);
    }

    private static void writeData(String fileName) {

        //writing new data to the binary file after finishing work
        try {
            FileOutputStream a = new FileOutputStream(fileName);
            ObjectOutputStream b = new ObjectOutputStream(a);
            b.writeObject(users);
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
            users = (List<Person>) ObjectInputStream.readObject();
            System.out.println(users.toString());
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

    private static void changeData(List<Person> users, String user_name, String user_pass,
                                   int user_balance, int user_account) {

        // SEARCH AND REPLACE IN AN ARRAYLIST USING ITERATOR
        ListIterator<Person> iterator = users.listIterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getName().equals(user_name)) {
                int indexArrayList = users.indexOf(person);
                List<Person> users_new = new ArrayList<>();     //creating a helper list users_new
                users_new.add(new Person(user_name, user_pass,
                        user_balance, user_account));
                users.remove(indexArrayList);                   // delete old string
                users.addAll(indexArrayList, users_new);        //insert new string
                break;
            }
        }
    }

    public static class Person implements Serializable {

        public String name;
        public String pass;
        public int balance;
        public int account;
        public ArrayList<String> empty = new ArrayList<>();

        public Person(String name, String pass, int balance, int account) {

            this.name = name;
            this.pass = pass;
            this.balance = balance;
            this.account = account;
        }

        public String getName() {
            return name;
        }

        public String getPass() {
            return pass;
        }

        public int getBalance() {
            return balance;
        }

        public int getAccount() {
            return account;
        }

        @Override
        public String toString() {

            return "Person{" +
                    "name='" + name + '\'' +
                    ", pass='" + pass + '\'' +
                    ", balance=" + balance +
                    ", account=" + account +
                    ", empty=" + empty +
                    '}';
        }
    }
}