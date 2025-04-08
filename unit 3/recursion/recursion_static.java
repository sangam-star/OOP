
//  user input to find the recursion with static keywords.

import java.util.Scanner;

public class recursion_static{
      
    static int factorial (int n){
        if( n == 0){
           return 1;
       
       }
       
       return n * factorial(n-1);
    }
     

    public static void main(String [] args){

        try (Scanner s = new Scanner(System.in)) {
            System.out.println(" enter the number");

            int num = s.nextInt();
       
            int result = factorial(num);
       
            System.out.println(" factorial of 5 is " + result); 
        }

        }

     
    }