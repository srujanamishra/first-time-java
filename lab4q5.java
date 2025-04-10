import java.util.Scanner;
public class lab4q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int order;
        System.out.println("Enter the order of the square matrix");
        order = sc.nextInt();
        int square[][] = new int[order][order];
        System.out.println("Enter the elements of the square matrix");
        for(int i = 0 ; i < order ; i++){
            for(int j = 0 ; j < order ; j++){
                square[i][j] = sc.nextInt();
            }
        }
        int sum = 0; 
        for(int i = 0 ; i < order ; i++){
            sum+= square[i][i];
        }
        System.out.println("Left="+sum);
        sum = 0;
        for(int i = 0 ; i<order ; i++){
            sum+= square[i][order-1-i];
        }
        System.out.println("Right="+sum);
    }
}
