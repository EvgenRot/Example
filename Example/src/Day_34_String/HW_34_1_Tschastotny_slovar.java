package Day_34_String;

import java.util.HashSet;
import java.util.Set;

public class HW_34_1_Tschastotny_slovar {
    public static void main(String[] args) {

        // выводит уникальные буквы из строки
        String word = ("DDEEGGDDEEEEFFGGDCCDDCCEEFF");
        for (int i = 0; i < word.length(); i++) {
            String unique_char = String.valueOf(word.charAt(i));
            int index_unique_char = word.indexOf(unique_char, 0);
            if (index_unique_char == i) {
                System.out.print(unique_char);
            }
        }

        // второй вариант, с классом HashSet
        word = ("DDEEGGDDEEEEFFGGDCCDDCCEEFF");
        Set uniqueChars = new HashSet();
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            if (uniqueChars.add(word.charAt(i))) {
                char letter_unique = word.charAt(i);
                System.out.print(letter_unique);
            }
         }
        System.out.println();

        // method Bulats
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i<word.length();i++){
            char c = word.charAt(i);
            int index  = word.indexOf(c, i+1);
            if(index == -1){
                stringBuilder.append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}

