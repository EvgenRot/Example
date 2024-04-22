package Day_50_Constructions;

import java.util.ArrayList;

public class ClassRoom {
    private String classRoom;
    private String classTeacher;
    ArrayList<Student> arrayList = new ArrayList<>();

    public ClassRoom(String classRoom, String classTeacher, ArrayList<Student> arrayList) {
        this.classRoom = classRoom;
        this.classTeacher = classTeacher;
        this.arrayList = arrayList;
    }

    public ClassRoom() {

    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    public ArrayList<Student> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Student> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "classRoom='" + classRoom + '\'' +
                ", classTeacher='" + classTeacher + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }
}
