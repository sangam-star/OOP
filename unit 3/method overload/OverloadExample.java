public class OverloadExample {

    // Method with 2 int parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with 3 int parameters
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with 2 double parameters
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample example = new OverloadExample();
        
        System.out.println("Sum of 2 integers: " + example.add(5, 10));
        System.out.println("Sum of 3 integers: " + example.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + example.add(5.5, 10.5));
    }
}