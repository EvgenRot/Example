package Day_7_Practik;

public class Type_Casting {
    public static void main(String[] args) {

        // неявное преобразование
        byte a = 10;
        short b = 20;
        int res = a + b;
        System.out.println(res);

        // явное преобразование
        double c = 10.0;
        int d = 20;
        byte e = (byte) (c + d);
        System.out.println(e);

        short f = 10;
        float g = 20;
        short result = (short) (f + g);
        System.out.println(result);
    }
}
