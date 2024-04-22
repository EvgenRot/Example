package Day_56_Inheritance1.Persons;

public class Dancer extends Person {

    protected String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer() {
    }

    public void dancing(){
        System.out.println(name + " dancing something");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getGroupName() {
        return groupName;
    }
}
