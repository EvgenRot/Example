package Day_28_reviewWeek5;

import com.sun.jdi.Value;

import java.util.Objects;
import java.util.Scanner;

public class CW_28_2 {
    public static void main(String[] args) {

        // ввод с клавиатуры ФИ и печать их раздельно с подсчетом кол-ва символов + печать инициалов
        var scanner = new Scanner(System.in);
        System.out.print("Введите Имя и Фамилию, разделенные пробелом ");
        String word = scanner.nextLine();
        String label = " ";

        int index = word.indexOf(label);

        System.out.print("Name - ");
        name(word, index);
        System.out.print(" состоит из " + index + " символов");
        System.out.print("\nFamily - ");
        family(word, index);
        System.out.print(" состоит из " + (word.length() - index) + " символов");
        System.out.println("\nInitials - " + word.charAt(0) + "." + word.charAt(index+1) + ".");

        // то же самое с использованием substring
        int index1 = word.indexOf(" ");
        String name1 = word.substring(0, index1);
        String family1 = word.substring(index1+1);

        System.out.println(name1 + " состоит из " + name1.length() + " символов");
        System.out.println(family1 + " состоит из " + family1.length() + " символов");
        System.out.println("Инициалы - " + name1.charAt(0) + "." + family1.charAt(0) + ".");


    }

    private static void family(String word, int index) {
        for (int i = index + 1; i < word.length(); i++) {
            char letter = word.charAt(i);
            System.out.print(letter);
        }
    }

    private static void name(String word, int index) {
        for (int i = 0; i < index; i++) {
            char letter = word.charAt(i);
                System.out.print(letter);
        }
    }
}