public class lab2q3 {
    public static void main(String[] args) {
        int evenCount = 0, oddCount = 0, evenSum = 0, oddSum = 0, grandTotal = 0;
        for(int i = 0; i<args.length; i++){
            int Num = Integer.parseInt(args[i]);
            if (Num % 2 ==0) {
                evenCount++;
                evenSum += Num;
                grandTotal += Num;
            }
            else{
                oddCount++;
                oddSum += Num;
                grandTotal += Num;
            }
        }
        System.out.println("No of Even Number: " + evenCount);
        System.out.println("No of Odd Number: " + oddCount);
        System.out.println("Sum of Even Number: " + evenSum);
        System.out.println("Sum of Odd Number:" + oddSum);
        System.out.println("Grand Total: " + grandTotal);
    }
}
