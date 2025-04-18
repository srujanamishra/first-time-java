public class finalmodifier {
        
        final int constantValue = 29;
    
    
        final void displayMessage() {
            System.out.println("This is a final method.");
        }
    
        public static void main(String[] args) {
            finalmodifier example = new finalmodifier();
    
    
            System.out.println("Final Variable: " + example.constantValue);
    
            
            example.displayMessage();
    
            
        }
    }
    
