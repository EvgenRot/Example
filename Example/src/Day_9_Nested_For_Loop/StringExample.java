package Day_9_Nested_For_Loop;

public class StringExample {
    public static void main(String[] args) {

        String str1 = "Ой мороз мороз не морозь меня!";
        int length = str1.length();
        int i1 = str1.indexOf("з"); // вывыод индекса буквы з
        System.out.println("Index string --> " + i1);

        // rechnung wiederholen buchstaben
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == 'з') {
                System.out.println(i);
            }
        }

        // gegenuber satze
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str1.charAt(i) + " ");
        }

        System.out.println();

        String str3 = new String(str1);
        String str2 = new String(str1);
        System.out.println(str2 == str3); // сравнение строkовых объектов - false
        System.out.println(str2.equals(str3));  // сравнение строkовых объектов - richtig
        System.out.println(str1.toUpperCase()); // grosse buchstabe
        System.out.println(str1.toLowerCase()); // kleine buchstabe
        System.out.println(str1.replaceAll(" ", "")); // keine probel

        // control
        String str4="Hello";
        boolean sad=str4.contains("o");
        System.out.println(sad);
    }
}
