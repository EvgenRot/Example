package Day_56_Inheritance1.Persons;

public class Programmer extends Dancer {

    private String companyName;


    public Programmer() {
  //      super();      //нельзя одновременно использовать super & this!!!
        this("Eugen", "programmer", "ABBA", "Microsoft");
    }

    @Override       // переписывание родительских методов, вот что это ТАКОЕ!!!
    protected void walk(String name, int age) {
 //       super.walk();
        System.out.println(getName() + " go somewhere");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName() + " eat something");
    }

    @Override
    public void learnt() {
     //   super.learnt();
        System.out.println(getName() + " learnt something");
    }

    public Programmer(String name, String designation, String groupName, String companyName) {
        super(name, designation, groupName);
        this.companyName = companyName;
    }


    public void coding(){
        super.learnt();
        String name = super.name;
        System.out.println(name + " coding something");
    }

    @Override
    public String toString() {
 //       return super.toString();
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }
}
