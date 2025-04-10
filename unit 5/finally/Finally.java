 



public class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("try block");
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("Result: " + result);
            
        } catch (ArithmeticException e) {
            System.out.println("catch block: " + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
    }
}