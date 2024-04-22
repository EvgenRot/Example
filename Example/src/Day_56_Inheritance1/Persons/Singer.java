package Day_56_Inheritance1.Persons;

public class Singer extends Person{

    private String groupName, bandName;

    public Singer(String name, String designation, String groupName, String bandName) {
        super(name, designation);
        this.groupName = groupName;
        this.bandName = bandName;
    }

    public Singer() {
    }

    public void singing(){
        System.out.println(name + " singing something");
    }

    public void playGitare(){
        System.out.println(name + " play Gitare something");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "groupName='" + groupName + '\'' +
                ", bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
