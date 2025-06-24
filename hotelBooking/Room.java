package org.example.hotelBooking;

public class Room {
    private int roomNumber;
    private String type; // Standard, Deluxe, Suite
    private boolean isAvailable;

    public Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.isAvailable = true;
    }

    public int getRoomNumber() { return roomNumber; }
    public String getType() { return type; }
    public boolean isAvailable() { return isAvailable; }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public String toString() {
        return "Room " + roomNumber + " [" + type + "] - " + (isAvailable ? "Available" : "Booked");
    }
}
