class Circle {
    final double PI = 3.14;  // Constant value using final
    double radius;

    Circle(double radius) {
        this.radius = radius;  // Using 'this' to refer to the instance variable
    }

    double getCircumference() {
        return 2 * PI * this.radius;  // Using 'this' for clarity
    }
}

public class CircumferenceCalculator {
    public static void main(String[] args) {
 a       Circle c = new Circle(5); // Creating a circle with radius 5
        System.out.println("Circumference of Circle: " + c.getCircumference());
    }
}
