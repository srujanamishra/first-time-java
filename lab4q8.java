import java.util.Scanner;
import java.util.Scanner;
public class lab4q8 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        n = sc.nextInt();
        int arr[] = new int[n];
        int t;
        System.out.println("Enter the elements of the array");
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n-1 ; i++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] >arr[j]){
                    t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("The Sorted Array is");
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
