/*
 * Area and Volume Calculator
 * This program calculates the area of a rectangle and the volume of spheres, cylinders, and cubes.
 * It uses object-oriented principles to structure the program efficiently.
 */

import java.util.Scanner;

public class Rectangle {
    // Variables to hold the dimensions of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the rectangle's dimensions
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * width; // Area formula: length multiplied by width
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt user for the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Create an instance of Rectangle with user-provided dimensions
        Rectangle rectangle = new Rectangle(length, width);

        // Calculate and display the area of the rectangle
        System.out.println("The area of the rectangle is: " + rectangle.calculateArea());
    }
}
