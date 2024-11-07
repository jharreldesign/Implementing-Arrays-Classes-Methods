import java.util.Scanner;
import Shapes.Sphere;
import Shapes.Cylinder;
import Shapes.Cube;

public class VolumeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to choose a shape for volume calculation
        System.out.println("Choose a shape to calculate volume:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cube");
        int choice = scanner.nextInt();

        // Call the appropriate method based on user choice
        switch (choice) {
            case 1:
                calculateSphereVolume(scanner); // Method to handle sphere volume calculation
                break;
            case 2:
                calculateCylinderVolume(scanner); // Method to handle cylinder volume calculation
                break;
            case 3:
                calculateCubeVolume(scanner); // Method to handle cube volume calculation
                break;
            default:
                System.out.println("Invalid choice!"); // Handle invalid input
        }
    }

    // Method to calculate the volume of a sphere
    private static void calculateSphereVolume(Scanner scanner) {
        // Prompt user for the radius of the sphere
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Create an instance of Sphere and calculate its volume
        Sphere sphere = new Sphere(radius);
        System.out.println("The volume of the sphere is: " + sphere.calculateVolume());
    }

    // Method to calculate the volume of a cylinder
    private static void calculateCylinderVolume(Scanner scanner) {
        // Prompt user for the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt user for the height of the cylinder
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Create an instance of Cylinder and calculate its volume
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("The volume of the cylinder is: " + cylinder.calculateVolume());
    }

    // Method to calculate the volume of a cube
    private static void calculateCubeVolume(Scanner scanner) {
        // Prompt user for the side length of the cube
        System.out.print("Enter the side length of the cube: ");
        double side = scanner.nextDouble();

        // Create an instance of Cube and calculate its volume
        Cube cube = new Cube(side);
        System.out.println("The volume of the cube is: " + cube.calculateVolume());
    }
}
