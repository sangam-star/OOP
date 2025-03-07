import java.util.Scanner;

class Factorialvalues { 
    int calculateFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
} 
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // input from user
        System.out.print("Enter a number: ");    
        int number = s.nextInt(); 
        Factorialvalues calculator = new Factorialvalues();  
        int result = calculator.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        
        s.close();
    }
}
