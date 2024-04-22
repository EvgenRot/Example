package Day_58_AccessModifier;

class DefaultClass {

    int x;

    String str;

    public DefaultClass(int x, String str) {
        this.x = x;
        this.str = str;
    }

    public DefaultClass() {
    }

    void defaultMethod(){
        System.out.println("default method");
    }
}
