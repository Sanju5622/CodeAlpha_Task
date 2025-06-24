package org.example.hotelBooking;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));
    }

    public List<Room> getAvailableRoomsByType(String type) {
        List<Room> available = new ArrayList<>();
        for (Room room : rooms) {
            if (room.getType().equalsIgnoreCase(type) && room.isAvailable()) {
                available.add(room);
            }
        }
        return available;
    }

    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public void showAllRooms() {
        for (Room room : rooms) {
            System.out.println(room);
        }
    }
}
