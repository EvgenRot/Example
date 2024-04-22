package Day_33_Review;

public class MyDate {

    public int day, mounth, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMounth() {
        return mounth;
    }

    public void setMounth(int mounth) {
        this.mounth = mounth;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int mounth, int year) {
        this.day = day;
        this.mounth = mounth;
        this.year = year;
    }

    public MyDate(){

    }
    public class Age {
        public int age;
    }

    public void display(){
        System.out.println(day + " " + mounth + " " +year);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", mounth=" + mounth +
                ", year=" + year +
                '}';
    }
}
