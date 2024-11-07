package Shapes;

public class Cylinder {
    private double radius;
    private double height;

    // Constructor to initialize the radius and height of the cylinder
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate the volume of the cylinder
    public double calculateVolume() {
        // Volume formula for a cylinder: π * r^2 * h
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
