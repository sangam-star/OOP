 
// class  cylinder {  
//     double pi = 3.14 ;
//     double radius ;
//     double height; 
//     double volume(){
//         return pi*radius*radius*height;
//     } 
// }
// public class volume_demo{ 
//     public static void main(String[] args) {
//         cylinder c1 = new cylinder();

//         double v;
//         c1.radius = 10;
//         c1.height = 5;

//         v = c1.volume();

//         System.out.println( "volume of cylinder ");
//         System.out.println(v); 
        
//     } 
// }


// Taking input from user of radius and height

import java.util.Scanner; 

class Cylinder {  
    double pi = 3.14;
    double radius;
    double height; 
    
    double volume() {
        return pi * radius * radius * height;
    } 
} 
public class volume_demo { 
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Cylinder c1 = new Cylinder();

        System.out.print("Enter the radius of the cylinder: ");
        c1.radius = s1.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        c1.height = s1.nextDouble(); 
        double v = c1.volume(); 
        System.out.println("Volume of the cylinder: " );
        System.out.println(v); 
        s1.close();
    } 
}
