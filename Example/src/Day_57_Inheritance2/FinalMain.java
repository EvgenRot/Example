package Day_57_Inheritance2;

    public class FinalMain {

        public static void main(String[] args) {

            final int a = 10;

            FinalClass finalClass = new FinalClass();
            finalClass.finalMethod();

            FinalClass finalClass1 = new FinalClass();
            finalClass  = finalClass1;

            System.out.println(finalClass1 == finalClass1);

            int num1 = 40;
            finalClass.num1 = num1;

            System.out.println(num1);

            finalClass.finalMethod();

            String str1 = "Hello";
            String s = str1.toUpperCase();

            str1 = s;

            System.out.println(str1);
            System.out.println(s);
            System.out.println(str1 == s);

//            Base base = new Base();
//            Derived derived = new Derived();
//            Base derived1 = new Derived();
        }
    }
