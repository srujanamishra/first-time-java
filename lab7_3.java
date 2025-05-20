public class lab7_3 {

        public static void main(String[] args) {
        try {
            
            int[] numbers = {1, 2, 3, 4};

            
            int index = 3;
            int value = numbers[index];

            
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
    }
}
