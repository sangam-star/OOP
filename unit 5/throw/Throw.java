 

// Custom exception class
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}

public class Throw {

    public static void validateInput(int number) throws InvalidInputException {
        if (number < 0) {
            throw new InvalidInputException("Invalid input - Number cannot be negative.");
        } else {
            System.out.println("Valid input: " + number);
        }
    }

    public static void main(String[] args) {
        try {
            validateInput(-5);
        } catch (InvalidInputException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
