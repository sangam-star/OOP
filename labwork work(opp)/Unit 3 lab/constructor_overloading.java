class Sum {
    // Constructor with three integers
    Sum(int a, int b, int c) {
        System.out.println("a + b + c: " + (a + b + c));
    }

    // Default constructor
    Sum() {
        System.out.println("No parameters");
    }

    // Constructor with two integers
    Sum(int a, int b) {
        System.out.println("a + b: " + (a + b));
    }

    // Constructor with two strings
    Sum(String str1, String str2) {
        System.out.println("String: " + str1 + str2);
    }
}

public class constructor_overloading {
    public static void main(String[] args) {
        new Sum(10, 20, 30);
        new Sum();
        new Sum(10, 20);
        new Sum("sangam, ", "sedai");
    }
}
