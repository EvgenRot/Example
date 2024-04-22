package Day_53_StaticClassMembers;

public class SingletonExampleMain {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

//        Test1 test1 = new Test1(100);
//        test1.numberTest1 = 100;

        // доступа к конструктору Test1 больше нет, т.к. он - private
        // поэтому используем static method, который возвращает статический объект

        SingletonExample singletonExample = SingletonExample.getInstance();
        if(singletonExample != null) {
            singletonExample.numberTest1 = 100;
            System.out.println(singletonExample);
            singletonExample.numberTest1 = 111;
            System.out.println(singletonExample);
            singletonExample.numberTest1 = 222;
            System.out.println(singletonExample);
        }
        SingletonExample.destroyInstance();

    }
}
