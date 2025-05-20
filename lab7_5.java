public class lab7_5 {
    public static void main(String[] args) {
        try {
            
        } catch (ArithmeticException e) {
            // Handling ArithmeticException
            System.out.println("ArithmeticException: " + e.getMessage());

        } catch (NullPointerException e) {
            
            System.out.println("NullPointerException: " + e.getMessage());

        } catch (Exception e) {
            
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            
            System.out.println("Finally block executed.");
        }
    }
}
