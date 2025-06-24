package org.example.hotelBooking;

public class Payment {
    public static boolean processPayment(String guestName, double amount) {
        System.out.println("Processing payment of ₹" + amount + " for " + guestName);
        System.out.println("Payment successful!");
        return true;
    }
}
