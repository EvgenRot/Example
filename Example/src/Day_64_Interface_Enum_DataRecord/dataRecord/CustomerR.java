package Day_64_Interface_Enum_DataRecord.dataRecord;

public record CustomerR(String firstName, String lastName, String adress, int phone) {

    public CustomerR(String firstName, String lastName, String adress) {    // можно использовать др.кол-во параметров
        this(firstName, lastName, adress, 0);
    }

    public void method(){
        System.out.println("Record Method");
    }
}
