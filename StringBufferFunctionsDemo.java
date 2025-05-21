public class StringBufferFunctionsDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java is my favourite programming language");

        
        stringBuffer.append(" and i love it ");
        System.out.println("a. After append(): " + stringBuffer);

       
        stringBuffer.insert(26, "also ");
        System.out.println("b. After insert(): " + stringBuffer);

        
        stringBuffer.delete(26, 31);
        System.out.println("c. After delete(): " + stringBuffer);

        
        int newCapacity = stringBuffer.capacity() + 20; 
        stringBuffer.ensureCapacity(newCapacity);
        System.out.println("d. Capacity after ensureCapacity(): " + stringBuffer.capacity());

        
        System.out.println("e. Current capacity: " + stringBuffer.capacity());

        
        stringBuffer.reverse();
        System.out.println("f. After reverse(): " + stringBuffer);
    }
}

