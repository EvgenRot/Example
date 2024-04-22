package Day_33_Review;

public class CW_33_1 {
    public static void main(String[] args) {

        printFullName("Yevhenii", "Khatskevych");
        printFullName("Yevhenii");

    }

    public static void printFullName(String name, String family) {
        System.out.println(name + " " + family);
    }
    public static void printFullName(String name) {
        System.out.println(name);
    }
}
