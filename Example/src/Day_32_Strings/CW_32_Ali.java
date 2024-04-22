package Day_32_Strings;

public class CW_32_Ali {
    public static void main(String[] args){

        String word = "Hello, world";
        System.out.println("Исходная строка: " + word);
        System.out.print("Гласные символы: ");

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a'||  c == 'e'||  c == 'i'||  c == 'o'|| c == 'u' ) {
                System.out.print(c + ", ");
            }
        }
    }
}


