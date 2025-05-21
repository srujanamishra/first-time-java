import java.util.Scanner;


class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}


public class NumberProcessor {
    public static void main(String[] args) {
        try {
            ProcessInput();
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception\nException occurred: " + e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    public static void ProcessInput() throws NegativeNumberException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new NegativeNumberException("number should be positive");
            } else {
                System.out.println("Double value: " + (number * 2));
            }
        } finally {
            scanner.close();
        }
    }
}

