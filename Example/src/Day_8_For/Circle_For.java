package Day_8_For;

public class Circle_For {
    public static void main(String[] args) {

        // вывод на экран чеетных и нечетных чисел
        System.out.println("Четные числа ");
        for (int i = 1; i <=100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Нечетные числа ");
        for (int i = 1; i <=100; i++) {
            if (!(i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }

        //вывод на экран латиницы
        for(char i = 'a'; i <= 'z'; i++){
            System.out.print((char) (i) + " ") ;
        }

        //вывод на экран ASII символов
        for(char i = 0; i <= 256; i++){
            System.out.print((char) (i) + " ") ;
        }
    }
}
