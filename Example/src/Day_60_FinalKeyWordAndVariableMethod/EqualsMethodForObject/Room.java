package Day_60_FinalKeyWordAndVariableMethod.EqualsMethodForObject;

import java.util.Objects;

public class Room {

    private String name;
    private int window;

    public Room(String name, int window) {
        this.name = name;
        this.window = window;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return window == room.window && Objects.equals(name, room.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, window);
    }
}
