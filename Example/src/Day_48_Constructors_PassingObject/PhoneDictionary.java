package Day_48_Constructors_PassingObject;

import java.util.ArrayList;

public class PhoneDictionary {

    public ArrayList<Phone> list = new ArrayList<>();

    public static void main(String[] args) {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        phoneDictionary.saveNumber("aaaa","1111");
        phoneDictionary.saveNumber("bbbb","2222");
        phoneDictionary.saveNumber("cccc","3333");
        phoneDictionary.saveNumber("dddd","4444");

        System.out.println(phoneDictionary.getNumber("cccc"));

        ArrayList<Phone> phones = phoneDictionary.list;

        for (Phone tel: phones){
            System.out.println(tel);
        }

    }

    private int findName(String name){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(name)){
                return i;
            }
        }
        return -1;
    }

    public String getNumber(String name){
        int position = findName(name);
        if (position == -1){
            return null;
        }else {
            return list.get(position).number;
        }
    }

    public void saveNumber(String name, String number){
        if (name == null || number == null){
            System.out.println("Имя и номер не могут быть нулевыми значениями ");
        }
        int position = findName(name);
        if (position >= 0){
            list.get(position).number = number;
        }else {
            Phone newPhone = new Phone(name,number,2);
            list.add(newPhone);
        }
    }
}
