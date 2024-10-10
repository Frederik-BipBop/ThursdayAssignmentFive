package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(new Room(2, 3));
        rooms.add(new Room(2, 3));
        rooms.add(new Room(2, 3));
        Building buildings = new Building(rooms, 3);
        System.out.println( " rooms in the building : " + countRoomsInBuilding(buildings));
        System.out.println(" Lamps in this building : " + countLampsInBuilding(buildings));
        System.out.println(" windows in this building : " + countWindowsInBuilding(buildings));
    }

    private static int countLampsInBuilding(Building a) {
        int count = 0;
        for (Room room : a.getRooms()) {
            count += room.getNumberOfLamps();

        }
        return count;
    }

    private static int countWindowsInBuilding(Building b) {
        int count = 0;
        for (Room room : b.getRooms()) {
            count += room.getNumberOfWindows();
        }
        return count;
    }

    private static int countRoomsInBuilding(Building c) {
        return c.getRooms().size();

    }

    private static boolean isNormal(Building d) {
        return d.getNumberOfFloors() >= countRoomsInBuilding(d);
    }
}

