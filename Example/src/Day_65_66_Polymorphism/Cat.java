package Day_65_66_Polymorphism;

public class Cat extends Animals65 implements ISound {

    @Override
    public void sound() {
        System.out.println("Miti-Miti");;
    }
}
