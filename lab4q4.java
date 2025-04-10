import java.util.Scanner;
public class lab4q4{
    public static void main(String[] args) {
        int rows,cols;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows");
        rows = sc.nextInt();
        System.out.println("Enter Columns");
        cols = sc.nextInt();
        int TwoArr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i < rows ; i++){
            for(int j  = 0 ; j <cols ; j++){
                TwoArr[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for(int i = 0 ; i < rows ; i++){
            for(int j =  0 ; j < cols ; j++){
                System.out.print(TwoArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
