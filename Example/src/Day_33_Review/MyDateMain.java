package Day_33_Review;

public class MyDateMain {
    public static void main(String[] args) {

        MyDate date1 = new MyDate();
        date1.setDay(15);
        date1.setMounth(3);
        date1.setYear(2024);
        date1.display();
        System.out.println(date1);

        MyDate date = new MyDate(10,2,2023);
        System.out.println(date);
    }

}
