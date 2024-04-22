package Day_50_Constructions;

public class Student {
    public String name;
    public int age;
    public int year;
    public int mounth;
    public int data;

    public Student(String name, int age, int year, int mounth, int data) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.mounth = mounth;
        this.data = data;
    }

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", year=" + year +
                ", mounth=" + mounth +
                ", data=" + data +
                '}';
    }
}
