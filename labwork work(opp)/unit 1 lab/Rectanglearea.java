
//Lab works of unit one to calculate the area of the rectangle
import java.util.Scanner;

public class Rectanglearea {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); //Scanner to read input from the user

        
        System.out.print("Enter the length of the rectangle: "); // enter the length of the rectangle
        double length = s.nextDouble(); 
        
        System.out.print("Enter the width of the rectangle: "); //enter the width of the rectangle
     
        double width = s.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width; // calculate area

        
        System.out.println("The area of the rectangle is: " + area);

      
        s.close(); //  Close the scanner  
    }
}