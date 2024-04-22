package Day_47_Construction;

public class Constructions {
    public static void main(String[] args) {

        Student student = new Student();
        Student student1 = new Student("Denis",85, 100, 90);
        Student student2 = new Student(null,30,40,50);
        student2.ID = 123456;

        Student.nextUniqueID = student.ID; // Can only throw class doing

        Student student3 = new Student(0);
        System.out.println(student3.ID);

        Student student4 = new Student(0);
        System.out.println(student4.ID);

        System.out.println(student2.toString());
        System.out.println(Student.nextUniqueID);

        System.out.println(student.getName());
        System.out.println(student.getAverige());

        System.out.println(student1.getName());
        System.out.println(student1.getAverige());

        System.out.println(student);

    }

    public static class Student{

        private String name;

        public double test1, test2, test3;

        public int ID;

        public int age;

        public static int nextUniqueID = 0;

        public Student(String name, double test1, double test2, double test3) {

            if(name == null){
                System.out.println("Not name!");
            }
            if(test1<50||test2<50||test3<50){
                System.out.println("Dont doing test!");
            }
            this.name = name;
            this.test1 = test1;
            this.test2 = test2;
            this.test3 = test3;
        }

        public Student() {
            this("Ali",35);
        }

        public Student(String name){
            this.name = name;
            nextUniqueID ++;
            this.ID = nextUniqueID;
        }

        public Student(String name, int age){
            nextUniqueID ++;
            this.name = name;
            this.ID = nextUniqueID;
            this.age = age;
        }
        public Student(int ID){
            this.ID = ID;
            this.ID++;
        }

        public String getName() {

            System.out.println(nextUniqueID);
            return name;
        }

        public  double getAverige () {

            return (test1 + test2 + test3)/3;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", test1=" + test1 +
                    ", test2=" + test2 +
                    ", test3=" + test3 +
                    ", ID=" + ID +
                    ", age=" + age +
                    '}';
        }
    }
}
