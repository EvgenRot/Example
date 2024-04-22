package Day_34_String;

public class Method_String {
    public static void main(String[] args) {

        String a = "John ";
        String b = "Doe ";
        String c = "Maikl ";

        // Объединитель строк
        String concat = a.concat(b.concat(c));
        System.out.println("Объединитель строк : " + concat);
        System.out.println("Объединитель строк : " + a + " " + b);

        // Иммутабельный класс String
        // Ключевое слово final
        final int num = 10; // присвоить 20 дальше уже не получится, это константа!
        method1();

        String myStr1 = "Hallo ";
        String myStr2 = myStr1.concat("World!");
        System.out.println("объединение строк : " + myStr2);

        myStr1 = myStr2;
        System.out.println("Объединитель строк : " + myStr1);
        System.out.println("Объединитель строк : " + myStr2);

        // возвращает boolean на наличие требуемых символов
        String str = "Hallo world fdgsdfgsdfgsdfgsdfgsdfg world";
        boolean h = str.contains("Ha");
        System.out.println("возвращает boolean на наличие требуемых символов : " + h);

        // возвращает индекс символа в строке
        int i = str.indexOf("world");
        System.out.println("возвращает индекс символа в строке : " + i);
        int i2 = str.indexOf("world", 10);
        System.out.println("возвращает индекс первого символа слова 'word' в строке : " + i2);

        // замена части строки
        String str1 = new String("Hallo.com");
        System.out.println(str1);
        String str2 = str1.replace("com", "net");
        System.out.println("замена части строки : " + str2);
        String str3 = str1.replaceFirst("com", "net");
        System.out.println("замена части строки : " + str3);

        // equals
        String str4 = "Hallo";
        String str5 = "Hallo";
        String str6 = new String("Hallo");
        System.out.println("equals : " + str4.equals(str5)); // true проверка значения
        System.out.println("equals : " + str4.equals(str6)); // true проверка значения
        System.out.println("equals : " + (str4==str5));         // true проверка объекта
        System.out.println("equals : " + (str4==str6));         // false проверка объекта

        // substring
        String str7 = new String("Hello World!");
        System.out.println("substring : " + str7.substring(6)); // return "World!"
        System.out.println("substring : " + str7.substring(0, 5)); // return "Hello"

        // toLowerCase
        System.out.println("toLowerCase : " + str7.toLowerCase()); // "hello world!"
        //toUpperCase
        System.out.println("toUpperCase : " + str7.toUpperCase()); // "HELLO WORLD!"
        // trim()
        String str8 = "    Hello World!   ";
        System.out.println("убираем пробелы спереди и сзади строки : " + str8.trim()); // убираем пробелы спереди и
        // сзади строки

        //ignoreCase
        String str9 = "hallo";
        System.out.println("ignoreCase : " + str9.equalsIgnoreCase("Hallo"));

        // isEmpty()
        System.out.println("isEmpty() : " + str9.isEmpty());


    }
    public static final void method1(){
        System.out.println("message");
    }
}
