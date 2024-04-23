package day_61_Abstraction_abstractClass.lesson;

public class Animal implements IEat{

    @Override
    public void eat() {
        System.out.println("Animal eating");
    }
}
