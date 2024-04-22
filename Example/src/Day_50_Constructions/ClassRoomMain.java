package Day_50_Constructions;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassRoomMain {
    public static void main(String[] args) {

        Student oleg = new Student("Oleg", 30, 1994,12,10);
        Student anna = new Student("Anna", 25, 1999,10,5);

        ClassRoom classRoom = new ClassRoom();
        classRoom.setClassRoom("SDET14R");
        classRoom.setClassTeacher("Belbot");

        System.out.println(classRoom);
        System.out.println("==========================================");

        ArrayList <Student> students = new ArrayList<>(Arrays.asList(oleg,anna));

        // oder

        ArrayList <Student> students1 = classRoom.getArrayList();
        students1.add(oleg);
        students1.add(anna);

        System.out.println((students));
        System.out.println("==========================================");
        System.out.println((students1));
        System.out.println("==========================================");
        System.out.println(classRoom);
    }
}
