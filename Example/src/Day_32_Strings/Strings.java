package Day_32_Strings;

public class Strings {
    public static void main(String[] args) {

        //  c SDK 15 появилась возможность заключать блоки строк в тройные кавычки, как в комментах
        String str_multi = """ 
                Sehr laaaaaaaaaaaaange satze
                auch sehr laaaaaaaaaaaaaaaange satze""";
        System.out.println(str_multi);

        String str = "Hallo";
        String str1 = "Hallo";
        String str2 = "Hello";
        System.out.println(str == str1); // одинаковые значения записывает в одну и ту же ячейку
        System.out.println(str == str2);


        String str3 = new String("Hallo, Welt!");
        String str4 = new String("Hallo, Welt!");
        System.out.println(str3 == str4); // одинаковые значения записывает в разные ячейки

        System.out.println(str_multi.length()); // длина строки
        System.out.println(str_multi.charAt(0)); // возвращает символ строки под индексом 0
        System.out.println((int)str_multi.charAt(0)); // возвращает номер символа в системе ASCII

    }
}
