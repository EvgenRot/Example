package Day_58_AccessModifier;

public class PublicClass {
    public int publicInt = 111;
    protected int protectedVar = 222;
    int defaultVar = 333;
    private int privateInt = 444;

    public void publicMethod(){
        System.out.println("publicMethod");
    }
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }
    void defaultMethod(){
        System.out.println("defaultMethod");
    }

    private void privateMethod(){
        System.out.println("privateMethod");
    }

    @Override
    public String toString() {
        return "PublicClass{" +
                "publicInt=" + publicInt +
                ", protectedVar=" + protectedVar +
                ", defaultVar=" + defaultVar +
                ", privateInt=" + privateInt +
                '}';
    }
}
