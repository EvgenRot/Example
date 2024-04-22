package Day_32_Strings;

public class CW_32_2 {
    public static void main(String[] args){

        String word = "Hello World!";
        String alfabet = "aeouiyj";

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            for (int j = 0; j< alfabet.length(); j++) {
                char letterAlfabet = alfabet.charAt(j);
                if(letterAlfabet == letter) {
                    System.out.println(letter);
                }
            }
        }
    }
}
