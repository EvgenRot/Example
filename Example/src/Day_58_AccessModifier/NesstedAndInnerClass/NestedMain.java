package Day_58_AccessModifier.NesstedAndInnerClass;

import java.util.HashMap;
import java.util.Map;

public class NestedMain {

    public static void main(String[] args) {

        NestedLesson.NestedClass nestedClass = new NestedLesson.NestedClass();
        System.out.println("nestedClass.x1 = " + nestedClass.x1);
        System.out.println("nestedClass.st = " + nestedClass.st);
        nestedClass.nestedMethod();

        NestedLesson nestedLesson = new NestedLesson();  // доступ к объектам внутреннего класса через верхний класс
        NestedLesson.InnerClass innerClass = nestedLesson.new InnerClass();
        innerClass.innerMethod();

        Map<Integer, String> map = new HashMap<>();


    }
}
