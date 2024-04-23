package day_61_Abstraction_abstractClass.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Bird {

    public Bird() {
    }

    abstract void fly();

    abstract int speed();

    public void eat(){
        System.out.println("Bird eating");
    }

    public static void main(String[] args) {

        Bird bird = new Bird() {   // unanimous class
            @Override
            void fly() {

            }

            @Override
            int speed() {
                return 0;
            }
        };

        bird.fly();

        List<Bird> list = new ArrayList<>(Arrays.asList(bird));

        for (Bird bird1: list){
            bird1.fly();
            System.out.println(bird1.speed());
            bird.eat();
        }
    }
}
