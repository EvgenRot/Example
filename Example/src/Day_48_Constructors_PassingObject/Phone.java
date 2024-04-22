package Day_48_Constructors_PassingObject;

public class Phone {

    String name;
    String number;
    int x = 10;

    public Phone(String name, String number, int x) {
        this.name = name;
        this.number = number;
        this.x = x;
    }

    public Phone() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
