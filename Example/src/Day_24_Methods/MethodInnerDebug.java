package Day_24_Methods;

public class MethodInnerDebug {
    public static void main(String[] args) {

        System.out.println("Вывод на экран сообщения перед методом");
        displayMessage();
        System.out.println("Вывод на экран сообщения после метода");
    }

    private static void displayMessage() {

        System.out.println("Hallo world!");
        methodInnerdisplayMessage();
    }

    private static void methodInnerdisplayMessage() {
        System.out.println("Version");
    }
}
