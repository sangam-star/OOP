// package unit 3.recursion;


import java.util.Scanner;


class factorial{
    int fact (int n){
        int result;

        if (n==1) return 1;
        result = fact(n-1) * n;
        return result;
}
}
public class userinput_recursion {
    public static void main(String[] args) {
        factorial f = new factorial();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find factorial of:");
        int n = scanner.nextInt();
        System.out.println("Factorial of  " + n + " is " + f.fact(n));
        scanner.close();
    }
    
}
