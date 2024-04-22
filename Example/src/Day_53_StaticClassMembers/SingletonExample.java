package Day_53_StaticClassMembers;

public class SingletonExample {

    public int numberTest1;
    public static int staticNumberTest1;
    private static SingletonExample singletonExample = null;  // 1-й шаг - приват статик объект

    private SingletonExample(int numberTest1) { // 2-й шаг - приват конструктор
        this.numberTest1 = numberTest1;
    }
    public static SingletonExample getInstance(){ // 3-й шаг - метод статик который возвращает статик объект из шага 1
        if (singletonExample == null){             // если в момент вызова он нуль, то инициализирует его
            singletonExample = new SingletonExample(100);
        }
        return singletonExample;
    }

    public static void destroyInstance(){
        singletonExample = null;
    }

    @Override
    public String toString() {
        return "SingletonExample{" +
                "numberTest1=" + numberTest1 +
                '}';
    }
}
