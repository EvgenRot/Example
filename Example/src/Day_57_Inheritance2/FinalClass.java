package Day_57_Inheritance2;

public final class FinalClass {

    int num1 = 20;
    String st1 = "FinalClass";


    public void finalMethod(){
        System.out.println(num1 + " " + st1);
    }

    @Override
    public String toString() {
        return "FinalClass{" +
                "num1=" + num1 +
                ", st1='" + st1 + '\'' + '}';
    }
}
