package Day_34_String;

public class CW_34_2 {
    public static void main(String[] args) {
        String str1 = "Ваша посылка доставлена на почтовое отделение , почтовый индекс такой-то";
        String str2 = "доставлена";

        checkWord(str1, str2);

    }

    private static void checkWord(String str1, String str2) {
        boolean a = str1.contains(str2);
        System.out.println("Ответ : " + a);
    }
}
