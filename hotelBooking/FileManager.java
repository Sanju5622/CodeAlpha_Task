package org.example.hotelBooking;

import java.io.*;
import java.util.*;

public class FileManager {
    private static final String FILE_PATH = "reservations.txt";

    public static void saveReservation(Reservation r) {
        try (FileWriter fw = new FileWriter(FILE_PATH, true)) {
            fw.write(r.toString() + "\n");
        } catch (IOException e) {
            System.out.println("Error saving reservation.");
        }
    }

    public static void showAllReservations() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Reservation: " + line);
            }
        } catch (IOException e) {
            System.out.println("No reservations found.");
        }
    }
}
