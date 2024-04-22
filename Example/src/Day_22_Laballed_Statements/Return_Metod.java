package Day_22_Laballed_Statements;

public class Return_Metod {
    public static void main(String[] args) {
        System.out.println("weqwer");
        System.out.println("weqwer");
        System.out.println("weqwer");
        getAge(24);
        System.out.println("assadfasdf");
        System.out.println("assadfasdf");
        System.out.println("assadfasdf");
    }

    private static int getAge(int age) {
        if (age<24) {
            return 20;
        }
        System.out.println("Method line");
        return age;
    }
}
