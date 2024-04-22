package Day_58_AccessModifier;

public class PublicMain {

    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();

        publicClass.publicMethod();
        publicClass.publicInt = 100;

        publicClass.defaultMethod();
        publicClass.defaultVar = 200;

        publicClass.protectedMethod();
        publicClass.protectedVar = 300;

        // приватные переменные и методы недоступны (стандартными способами)

        System.out.println(publicClass);

        DefaultClass defaultClass = new DefaultClass();      // а теперь попробуй перенести в другой пакет
        defaultClass.x = 10;
        defaultClass.str = "Message";
        defaultClass.defaultMethod();
        System.out.print(defaultClass.str + " " + defaultClass.x);

    }
}
//    private class PrivateClass{ // not allow to create private class
//
//    }
//    public class newPublicClass{  // not allow to create new public class
//
//    }
//    protected class ProtectedClass{   // not allow to create protected class
//
//    }


