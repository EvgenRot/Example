package Day_54_StaticClassMembers2;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class DarkSideJava {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException,
            InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Class<?> aClass = Class.forName("Day_54_StaticClassMembers2.SampleClass");
        Object object = aClass.getDeclaredConstructor().newInstance();
        Field value = aClass.getDeclaredField("value");
        value.setAccessible(true);
        System.out.println("мы добрались к приват переменной SampleClass!!!" + value.getInt(object));

        // second variant

        SampleClass sampleClass = new SampleClass();
        Class<?> aClass1 = sampleClass.getClass();
        Field field = aClass1.getDeclaredField("value");
        field.setAccessible(true);
        System.out.println("Second variant " + field.get(sampleClass));
    }
}
