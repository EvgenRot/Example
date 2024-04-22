package Day_64_Interface_Enum_DataRecord.enumPacket;

import java.util.Arrays;

public enum Books {
    JAVA("Java", "1990"), C("C", "1995"),
    PYTHON("Python", "2000");
    private String booksName;
    private String yearOfPublisher;

    public static void main(String[] args) {
        System.out.println(Books.JAVA);
        Books[] books = Books.values();

        System.out.println(Arrays.asList(books));

        Books python = Books.PYTHON;
        switch (python){
            case JAVA -> System.out.println(Books.JAVA);
            case C -> System.out.println(Books.C);
            case PYTHON -> System.out.println(Books.PYTHON);
            default -> System.out.println("Not");
        }
    }

    Books(String booksName, String yearOfPublisher) {
        this.booksName = booksName;
        this.yearOfPublisher = yearOfPublisher;
    }

    public String getBooksName() {
        return booksName;
    }

    public String getYearOfPublisher() {
        return yearOfPublisher;
    }

    @Override
    public String toString() {
        return "Books{" +
                "booksName='" + booksName + '\'' +
                ", yearOfPublisher='" + yearOfPublisher + '\'' +
                '}';
    }
}
