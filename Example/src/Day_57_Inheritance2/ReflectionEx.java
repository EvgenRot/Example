package Day_57_Inheritance2;

import Day_56_Inheritance1.Persons.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionEx {
    public ReflectionEx() {
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        ReflectionEx reflectionEx = new ReflectionEx();
        Class<? extends ReflectionEx> aClass = reflectionEx.getClass();
        System.out.println("aClass.getName() " + aClass.getName());

        Constructor<? extends ReflectionEx> declareConstructor = aClass.getDeclaredConstructor();

        ReflectionEx reflectionEx1 = declareConstructor.newInstance();
        System.out.println("reflectionEx1 " + reflectionEx1);

        Method[] declaredMethod = aClass.getDeclaredMethods(); // показать все методы класса
        System.out.println("Arrays.toString(declaredMethod) " + Arrays.toString(declaredMethod));

        Class<?> superclass = aClass.getSuperclass();
        System.out.println("superclass " + superclass);

    }

    static int a;

    static Person person;

    static void staticMethod(){
        System.out.println("Static Method");
    }
    void instanceMethod(){
        System.out.println("Instance method");
    }

}
