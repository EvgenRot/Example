package Day_34_String;

import java.util.HashSet;
import java.util.Set;

public class HW_34_2_Tschastotny_slovar {
  public static void main(String[] args) {


    // выводит неповторяющиеся буквы из строки
    String word = ("DDEECGDDEEEEFGGDCDDM");
    for (int i = 0; i < word.length(); i++) {
      String unique_char = String.valueOf(word.charAt(i));
      int index_unique_char_before = word.substring(0,i).indexOf(unique_char, 0);
      int index_unique_char_after = word.substring(i+1).indexOf(unique_char, 0);
      if (index_unique_char_after == -1&&index_unique_char_before==-1) {
        System.out.print(unique_char);
      }
    }

    // второй вариант, с классом HashSet
    word = ("DDEECGDDEEEEFGGDCDDM");
    System.out.println();
    Set uniqueChars = new HashSet();
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      if (uniqueChars.add(word.charAt(i))) {
        char letter_unique = word.charAt(i);
        for (int j = 0; j < word.length(); j++) {
          char letter = word.charAt(j);
          if (letter == letter_unique) {
            count++;
          }
        }
        if (count==1) {
          System.out.print(letter_unique);
        }
        count = 0;
      }
    }

    // method Bulats
    System.out.println();
    StringBuilder stringBuilder = new StringBuilder();
    for(int i = 0; i<word.length();i++){
      char c = word.charAt(i);
      int firstIndex = word.indexOf(c);
      int secondIndex = word.lastIndexOf(c);
      if(firstIndex==secondIndex){
        stringBuilder.append(c);
      }
    }
    System.out.println(stringBuilder);
  }
}
