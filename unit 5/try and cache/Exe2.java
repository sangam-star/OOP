

public class Exe2{
    public static void main(String[] args) {
        
        int d, a ;
        
        try{
            d= 0;
            a = 42/d;

            System.out.println("Value of a: " + a);
            
        }
        
        catch(ArithmeticException e) {


            System.out.println(" division by zero");
        }

        System.out.println(" After catch statement");
        
        
    }
    
}
