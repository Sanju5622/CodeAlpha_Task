package org.example.StudentGradeTracker;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    // Constructor
    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
}

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList to store Student objects
        ArrayList<Student> students = new ArrayList<>();

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Input student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter grade for " + name + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Add student to list
            students.add(new Student(name, grade));
        }

        // Display student grades
        System.out.println("\n--- Student Grades ---");
        double total = 0;
        for (Student s : students) {
            System.out.println(s.name + ": " + s.grade);
            total += s.grade;
        }

        // Calculate and display average grade
        double average = total / students.size();
        System.out.printf("\nAverage Grade: %.2f\n", average);

        scanner.close();
    }
}
