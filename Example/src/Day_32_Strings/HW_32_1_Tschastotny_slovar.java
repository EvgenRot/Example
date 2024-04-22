package Day_32_Strings;

import java.util.HashSet;
import java.util.Set;

public class HW_32_1_Tschastotny_slovar {
  public static void main(String[] args) {

    // выводит уникальные буквы из строки с подсчетом их количества
    String word = ("Abcdaorwakocoeeca");
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
        System.out.println("Кол-во букв " + letter_unique + " равно " + count);
        count = 0;
      }
    }
  }
}
