package Day_34_String;

import java.util.LinkedHashSet;

public class HW_35_Ali {
    public static void main(String[] args) {

        // выводит уникальные буквы из строки
        String str = "AASSDDFFERT";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            set.add(c);
        }
        StringBuilder result = new StringBuilder();
        for(Character c : set ) {
            result.append(c);
        }
        System.out.println(result);


        // выводит неповторяющиеся буквы из строки
        StringBuilder uniqueChar = new StringBuilder();
        for(int i = 0; i< str.length(); i++) {
            char currentChar  = str.charAt(i);
            if(str.indexOf(currentChar) == str.lastIndexOf(currentChar)){
                uniqueChar.append(currentChar);
            }
        }
        System.out.println(uniqueChar);

        // выводит строку в перевернутом виде
        StringBuilder reservd = new StringBuilder();
        for(int i = str.length()-1; i>=0; i--){
            reservd.append(str.charAt(i));
        }
        System.out.println(reservd);
    }

}
