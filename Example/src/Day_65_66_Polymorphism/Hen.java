package Day_65_66_Polymorphism;

public class Hen extends Animals65 implements ISound{

    @Override
    public void sound() {
        System.out.println("Ki-ri-ki-ki");
    }
}
