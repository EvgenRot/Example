package Day_56_Inheritance1.Persons;

public class Person /*extends Object*/ {  // по умолчанию все классы наследуются от класса Object(super-class)

    protected String name, designation;

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    protected void walk(String name, int age){
        System.out.println(name + " go somewhere");
    }
    public void eat(){
        System.out.println(name + " eat something");
    }
    public void learnt(){
        System.out.println(name + " learnt something");
    }

    public void setName(String name) {
        this.name = name;
    }
}
