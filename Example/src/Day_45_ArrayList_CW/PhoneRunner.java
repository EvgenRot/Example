package Day_45_ArrayList_CW;

import java.util.ArrayList;

public class PhoneRunner {
    public static void main(String[] args) {

        PhoneDirectory phoneDirectory = new PhoneDirectory();

        Phone phone = new Phone();
        phone.name = "beck";
        phone.phoneNum = "1111";
        phoneDirectory.data[phoneDirectory.dataCount] = phone;

        phoneDirectory.saveNumber("uri","2222");
        phoneDirectory.saveNumber("dani","3333");
        phoneDirectory.saveNumber("oleg","4444");

        ArrayList<Phone> phoneDirectories = new ArrayList<>();

        phoneDirectories.add(0,phone);
        phoneDirectories.add(1,phoneDirectory.data[0]);
        phoneDirectories.add(2,phoneDirectory.data[1]);
        phoneDirectories.add(3,phoneDirectory.data[2]);

        System.out.println(phoneDirectories);

    }
}
