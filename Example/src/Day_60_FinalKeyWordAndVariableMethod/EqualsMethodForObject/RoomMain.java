package Day_60_FinalKeyWordAndVariableMethod.EqualsMethodForObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoomMain {

    public static void main(String[] args) {

        Room room = new Room("Waiting Room", 2);
        Room room1 = new Room("Waiting Room", 2);

        String a = "aaa";
        String a1 = "aaa";


        System.out.println("room = " + room );
        System.out.println("room1 = " + room1 );

        System.out.println(room.hashCode());
        System.out.println(room1.hashCode());

        System.out.println(a.equals(a1));    // при проверке строк, equals является методом класса String и он работает

        System.out.println(room == room1);          // проверка покажет, что это разные объекты

        System.out.println(room.equals(room1));     // для проверки объектов лучше использовать метод equals
        System.out.println(room.hashCode() == room1.hashCode());   // или object1.hashCode == object2.hashCode
                                                    // но, перед применением, их надо переопределить

        List<Room> rooms = new ArrayList<>();
        rooms.add(room);
        rooms.add(room1);

        if(rooms.get(0).equals(rooms.get(1))){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        Map<String, Room> roomMap = new HashMap<>();        // работает быстрее чем ArrayList
        roomMap.put("room", room);
        roomMap.put("room1", room1);

        Room room2 = roomMap.get("room");
        List<Room> list = new ArrayList<>();
        list.add(room);
        list.add(room1);

        Room room3 = list.get(0);

    }
}
