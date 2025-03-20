



class Staticexample {
    // Static variable
    static int count = 2;

    // Static method
    static void showCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        // Accessing static variable and method without object
        Staticexample.count = 5;
        Staticexample.showCount();
    }
}



 
