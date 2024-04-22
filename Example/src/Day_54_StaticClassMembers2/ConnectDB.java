package Day_54_StaticClassMembers2;

public class ConnectDB {

    public static void main(String[] args){

        new ConnectDB();
    }

    static {
        System.out.println(connectToDB());
        System.out.println(retrieveDataFromDB());
    }
    static String connectToDB(){
        return "We connected to DB";
    }
    static String retrieveDataFromDB(){
        return "We get data from DB";
    }
}
