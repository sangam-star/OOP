 
class VolumeCalculator {
    public double calculateVolume(Cube cube) {
        return Math.pow(cube.getSide(), 3);
    }

    public double calculateVolume(Cylinder cylinder) {
        return Math.PI * Math.pow(cylinder.getRadius(), 2) * cylinder.getHeight();
    }
}

class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}

class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        Cylinder cylinder = new Cylinder(2, 5);

        VolumeCalculator calculator = new VolumeCalculator();

        System.out.println("Volume of Cube: " + calculator.calculateVolume(cube));
        System.out.println("Volume of Cylinder: " + calculator.calculateVolume(cylinder));
    }
}