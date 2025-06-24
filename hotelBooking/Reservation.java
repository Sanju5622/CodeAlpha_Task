package org.example.hotelBooking;

public class Reservation {
    private String guestName;
    private int roomNumber;
    private String checkInDate;
    private String checkOutDate;

    public Reservation(String guestName, int roomNumber, String checkInDate, String checkOutDate) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    @Override
    public String toString() {
        return guestName + "," + roomNumber + "," + checkInDate + "," + checkOutDate;
    }
}
