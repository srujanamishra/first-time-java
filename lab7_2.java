import java.util.Scanner;

public class lab7_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            
            System.out.print("Enter the value of x: ");
            int x = scanner.nextInt();

            System.out.print("Enter the value of y: ");
            int y = scanner.nextInt();

        
            if (y == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }

            
            double result = (double) x / y;
            System.out.println("Result of x/y: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
        
            scanner.close();
        }
    }
}
