package Shapes;

public class Sphere {
    private double radius;

    // Constructor to initialize the radius of the sphere
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Method to calculate the volume of the sphere
    public double calculateVolume() {
        // Volume formula for a sphere: (4/3) * π * r^3
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
