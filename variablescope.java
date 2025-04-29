public class variablescope {

    static String globalVariable = "I am a global variable";

    public static void main(String[] args) {
    
        String localVariable = "I am a local variable";
        System.out.println(localVariable);
        localVariable = "Modified local variable";
        System.out.println(localVariable);

    
        System.out.println(globalVariable);

    
        variablescope example = new variablescope();
        example.instanceVariableExample();
    }

    
    String instanceVariable = "I am an instance variable";

    public void instanceVariableExample() {
        System.out.println(instanceVariable);

        
        instanceVariable = "Modified instance variable";
        System.out.println(instanceVariable);

        
        System.out.println(globalVariable);
    }
}
