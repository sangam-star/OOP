import java.util.Scanner;

class Cube {
    double side;

    Cube(double s) {
        side = s;
    }

    double Volume() {
        return side * side * side;
    }
}

class Cylinder {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    double Volume() {
        return 3.1416 * radius * radius * height;
    }
}

public class VolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cube Volume
        System.out.print("Enter the side of the cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Volume of Cube: " + cube.Volume());
        
        // Cylinder Volume
        System.out.print("Enter the radius and height of the cylinder: ");
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume of Cylinder: " + cylinder.Volume());
        
        scanner.close();
    }
}
