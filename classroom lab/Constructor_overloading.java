 
class Rectangle {
    public double length,breadth;


     
    public Rectangle() {
        this.length = 1.0;
        this.breadth = 1.0;
    }

     
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    
    public Rectangle(double side) {
        this.length = side;
        this.breadth = side;
    } 
     
    public double getArea() {
        return length * breadth;
    }

    
    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth + ", Area: " + getArea());
    }
}



public class Constructor_overloading{

    public static void main(String[] args) {
             
            Rectangle rectangle1 = new Rectangle();
            rectangle1.display();
    
             
            Rectangle rectangle2 = new Rectangle(5, 3);
            rectangle2.display();
    
           
            Rectangle rectangle3 = new Rectangle(5);
            rectangle3.display();
    
             
            
        }

    }


