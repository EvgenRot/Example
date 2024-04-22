package Day_48_Constructors_PassingObject;

public class Review_47 {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1;

        student1 = student;
        System.out.println(student);
        System.out.println(student1);       // ссылка на тот же участок памяти

        int x = 10;                         // primitive передает в метод КОПИЮ значения
        Phone phone = new Phone();          // вызов из другого класса не поможет!!! тоже самое
        System.out.println(phone.x);
        changeInt(phone.x);               // Т.к. с примитивами в метод передается только КОПИЯ значения,
        System.out.println("=========");
        System.out.println(phone.x);      // то ничего не поменяется!!! значение х останется тоже самое - 10!!!

        Person ali = new Person("Ali",32);

        System.out.println("1 - " + ali);
        ali.changeAge(ali);                 // вызов объекта в методе приводит к дубликату ссылки и потере значения
        System.out.println("2 - " + ali);
        ali.changeAge1(ali);                // вызов объекта в методе приводит к дубликату ссылки и потере значения
        System.out.println("3 - " + ali);

        ali.changeAge2(ali);                // вот так правильно
        System.out.println("==========");
        System.out.println("4 - " + ali); // поменять получится только с применением переменной ссылочного типа!!!"Анна"
        ali.changeAge3(ali);               // вот так правильно
        System.out.println("5 - " + ali); // поменять получится только с применением переменной ссылочного типа!!!
    }
    static int changeInt(int x){
        x = x + 10;
        return x;
    }
    static class Person{
        public String name;
        public int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void changeAge(Person ali){
            ali = new Person(ali.name, ali.age);
            ali.name = "Anna";
            ali.age = 25;
        }

        public void changeAge1(Person ali){
            ali = new Person(ali.name, ali.age);
            ali.name = "Evgen";
            ali.age = 55;
        }

        public void changeAge2(Person ali){
            ali.name = "Anna";
            ali.age = 25;
        }

        public void changeAge3(Person ali){
            ali.name = "Evgen";
            ali.age = 55;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static class Student{
        public  String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Student() {

        }
    }
}
