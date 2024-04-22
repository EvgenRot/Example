package Day_53_StaticClassMembers;

public class StaticMethods {

    public static void main(String[] args) {

        System.out.println(Math.sqrt(4));

        System.out.println(MathUtils.add(4, 7)); // можем отсюда вывести на консоль
    }
}
class MathUtils{

    public static int add(int a, int b){

        return a+b;
    }
    public static class StaticClass{ // вложенный класс

        static int x;

        static void staticMethod(){

        }
    }
    static {  // это блок
        int y = 10;
    }
}
