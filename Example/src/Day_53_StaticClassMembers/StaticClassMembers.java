package Day_53_StaticClassMembers;

public class StaticClassMembers {

    public static int staticNumber;


    public static void main(String[] args) {

        staticMethod();

//        nonStaticMethod(); - unmoglich create

 //       static int staticMain; - unmoglich create

        System.out.println(staticNumber);

        StaticClassMembers members = new StaticClassMembers();

        members.nonStaticMethod();

        System.out.println(StaticClassMembers.staticNumber);
    }
    public static void staticMethod(){

        System.out.println(staticNumber);

    }
    public void nonStaticMethod(){

 //       static int nonStaticMethodNumber; - unmoglich create

        int g = 9;

        System.out.println(staticNumber);
    }
}
class Hallo{
    public static void main(String[] args) {

        System.out.println(StaticClassMembers.staticNumber);
    }
}
