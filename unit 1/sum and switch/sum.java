
// write a program to find sum of any two numbers

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in); // scanner is used to take input 
        
        System.out.println("enter 1st number:\n");
        double a = s.nextDouble();
        System.out.println("enter 2nd number:\n");
        double b = s.nextDouble();
        double sum = a + b;
        System.out.println("sum is :" +sum);
        s.close();
    }
    
}
