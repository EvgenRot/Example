package Day_57_Inheritance2.ClassWork;

public class Animal {
    public String getData1() {
        return data1;
    }

    protected String data1;

    public Animal(String data1) {
        this.data1 = data1;
    }

    public Animal() {
    }

    public void move(){
        System.out.println("Something moving");
    }

    public void eat(){
        System.out.println("Something eating");
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "data1='" + data1 + '\'' +
                '}';
    }
}
