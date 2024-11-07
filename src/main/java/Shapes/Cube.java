package Shapes;

public class Cube {
    private double side;

    // Constructor to initialize the side length of the cube
    public Cube(double side) {
        this.side = side;
    }

    // Method to calculate the volume of the cube
    public double calculateVolume() {
        // Volume formula for a cube: side^3
        return Math.pow(side, 3);
    }
}
