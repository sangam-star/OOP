import java.util.Scanner;

// Class to calculate factorial using recursion
class FactorialCalculator {
    public long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactorialCalculator calculator = new FactorialCalculator();
        
        System.out.print("Enter a number to find its factorial: ");
        int num = scanner.nextInt();
        
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long result = calculator.factorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        }
        
        scanner.close();
    }
}
