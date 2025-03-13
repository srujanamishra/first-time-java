// WAP in java which will accept two integers from the command line argument and will display the sum of two numbers.//
public class lab2q2{
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int sum = a + b;
        System.out.println("the Sum of Two Number is: "+ sum);

    }
}