package Day_57_Inheritance2.ClassWork;

public class Dog extends Animal{
    protected String data2;


    public Dog(String data1, String data2) {
        super(data1);
        this.data2 = data2;
    }

    public Dog(String data2) {
        this.data2 = data2;
    }
    public Dog(){

    }

    public final void bark(){
        System.out.println("Something doing");
    }

    @Override
    public void move() {
        super.move();
    }
}
