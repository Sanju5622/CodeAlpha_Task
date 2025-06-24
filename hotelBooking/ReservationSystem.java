package org.example.hotelBooking;

import java.util.*;

public class ReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();

        while (true) {
            System.out.println("\nHotel Reservation System:");
            System.out.println("1. View All Rooms");
            System.out.println("2. Search Available Rooms");
            System.out.println("3. Book Room");
            System.out.println("4. View All Reservations");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    hotel.showAllRooms();
                    break;
                case 2:
                    System.out.print("Enter room type (Standard/Deluxe/Suite): ");
                    String type = sc.nextLine();
                    List<Room> availableRooms = hotel.getAvailableRoomsByType(type);
                    if (availableRooms.isEmpty()) {
                        System.out.println("No rooms available of type " + type);
                    } else {
                        for (Room r : availableRooms) {
                            System.out.println(r);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter room number to book: ");
                    int roomNum = sc.nextInt();
                    sc.nextLine();
                    Room room = hotel.getRoomByNumber(roomNum);
                    if (room != null && room.isAvailable()) {
                        System.out.print("Enter check-in date (dd-mm-yyyy): ");
                        String in = sc.nextLine();
                        System.out.print("Enter check-out date (dd-mm-yyyy): ");
                        String out = sc.nextLine();
                        System.out.print("Enter payment amount: ₹");
                        double amount = sc.nextDouble();
                        sc.nextLine();

                        if (Payment.processPayment(name, amount)) {
                            room.setAvailable(false);
                            Reservation r = new Reservation(name, roomNum, in, out);
                            FileManager.saveReservation(r);
                            System.out.println("Room booked successfully!");
                        }
                    } else {
                        System.out.println("Room not available.");
                    }
                    break;
                case 4:
                    FileManager.showAllReservations();
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
