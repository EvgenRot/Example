package Day_44_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareToClass {
    public static void main(String[] args) {


        Student student = new Student("Eugen", 18);
        Student student1 = new Student("Eugen1", 19);
        Student student2 = new Student("Eugen2", 20);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student, student1, student2));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(student);

    }
}
