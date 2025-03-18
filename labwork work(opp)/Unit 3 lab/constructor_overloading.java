import java.util.Scanner;

class Sum {
    int Sum;
    String name;

    //   for integer sum
    Sum(int a, int b) {
        Sum = a + b;
        System.out.println("Sum of integers: " + Sum);
    }

    //   for string  
    Sum(String a, String b) {
        name = a + " " + b ;
        System.out.println("string: " + name);
    }
}

public class Constructor_overloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking integer input
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        Sum obj1 = new Sum(int1, int2);
        
        scanner.nextLine(); // Consume the newline character
        
        // Taking string input
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        Sum obj2 = new Sum(str1 , str2);
        
        scanner.close();
    }
}
