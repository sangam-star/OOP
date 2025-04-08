
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class Exception_alll {

    public static void checkNumber(int number) throws MyException {
        if (number < 0) {
            throw new MyException("Negative number is not allowed.");
        }
        System.out.println("The number is: " + number);
    }

    public static void main(String[] args) {
        try {
            // Trying to call the method that may throw an exception
            checkNumber(-5);  // This will throw MyException
        } catch (MyException e) {
            // Catching the exception
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }

        // Another example using arithmetic division by zero
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());  // Handle the division by zero
        } finally {
            System.out.println("Finally block after division attempt.");
        }
    }
    
}
