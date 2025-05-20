public class lab7_4 {

    public static void main(String[] args) {
        try {
            
            String nullString = null;

            
            int length = nullString.length();

            
            System.out.println("Length of the string: " + length);
        } catch (NullPointerException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
    }
}
