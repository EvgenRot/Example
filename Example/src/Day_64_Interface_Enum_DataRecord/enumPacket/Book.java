package Day_64_Interface_Enum_DataRecord.enumPacket;

import java.util.Arrays;

public class Book {

    public static final String JAVA = "Beginner for JAVA";
    public static final String C = "Beginner for C++";
    public static final String Python = "Beginner for PYTHON";

    public static void main(String[] args) {

        String java = Book.JAVA;
        Books java1 = Books.JAVA;

        Books[] values = Books.values();
        System.out.println(Arrays.toString(values));

        for (Books book: values){
            System.out.println(book);
        }
    }
}
