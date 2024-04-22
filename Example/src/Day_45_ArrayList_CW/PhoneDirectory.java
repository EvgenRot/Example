package Day_45_ArrayList_CW;

import java.util.Arrays;

public class PhoneDirectory {

    public Phone[] data;
    public int dataCount;

    public PhoneDirectory() {
        this.data = new Phone[1];
        this.dataCount = 0;
    }

    private int find(String name) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].name.equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name) {
        int position = find(name);
        if (position == -1) {
            return null;
        } else {
            return data[position].phoneNum;
        }
    }

    public void saveNumber(String name, String number) {
        if (name == null || number == null)
            System.out.println("Имя и номер не могут нулевыми значениями");

        int position = find(name);
        if (position >= 0) {
            data[position].phoneNum = number;
        } else {
            if (dataCount == data.length) {
                data = Arrays.copyOf(data, 2 * data.length);
            }
            Phone newphone = new Phone();
            newphone.name = name;
            newphone.phoneNum = number;
            data[dataCount] = newphone;
            dataCount++;
        }
    }


}
