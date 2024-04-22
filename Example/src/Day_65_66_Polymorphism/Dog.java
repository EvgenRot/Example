package Day_65_66_Polymorphism;

public class Dog extends Animals65 implements ISound{

    @Override
    public void sound() {
        System.out.println("Gav-Gav");;
    }
}
