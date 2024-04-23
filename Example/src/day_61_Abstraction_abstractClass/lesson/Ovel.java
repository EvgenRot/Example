package day_61_Abstraction_abstractClass.lesson;

public class Ovel extends Bird{

    @Override
    void fly() {
        System.out.println("Ovel flying");
    }

    @Override
    int speed() {
        return 50;
    }

    @Override
    public void eat() {
        System.out.println("ovel eating");
    }
}
