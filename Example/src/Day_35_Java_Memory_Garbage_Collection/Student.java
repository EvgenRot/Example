package Day_35_Java_Memory_Garbage_Collection;

public class Student {

    public  int age; // variable of object
    public  String name;
    public String adress;
    public String beruf;

    public Student(int age, String name, String adress, String beruf) {
        this.age = age;
        this.name = name;
        this.adress = adress;
        this.beruf = beruf;
    }

    public Student(){

    }

    public void showData() {

    }
    public void sum(int a){
        int x = a + 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", beruf='" + beruf + '\'' +
                '}';
    }
}
