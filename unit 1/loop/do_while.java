

// Using a do-while loop to calculate the sum of numbers from 10 t0 15
 
 
public class do_while {
    public static void main(String[] args) {
        int  a = 10;
        int  b = 15;
        int sum = 0;
        
        // Using a do-while loop to calculate the sum
        do {
            sum +=  a;   
             a++;        
        } while (a <= b );   
        
        // Output the result
        System.out.println("The sum of numbers from 10 to 15 is: " + sum);
    }
}