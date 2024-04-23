package Day_64_Interface_Enum_DataRecord.enumPacket;

import java.util.Arrays;

public class Book {

    public static final String JAVA = "Beginner for JAVA";
    public static final String C = "Beginner for C++";
    public static final String Python = "Beginner for PYTHON";

    public static void main(String[] args) {

        String java = Book.JAVA;
        System.out.println("Book method " + java);

        Books java1 = Books.JAVA;
        System.out.println("Books method " + java1);

        Books[] values = Books.values();
        System.out.println(Arrays.toString(values));

        for (Books books: values){
            System.out.println(books);
        }
    }
}
