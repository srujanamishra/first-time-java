import java.util.Scanner;
public class lab4q9 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter no of elements: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr1;
        arr1 = new int[n];
        int []arr2;
        arr2 = new int[100];
        System.out.println("Enter the elements of the list");
        for(int i = 0 ; i < n  ; i++){
            arr1[i] = sc.nextInt();
            arr2[arr1[i]%100]++;
        }
        for(int i = 0 ; i<100 ; i++){
            if(arr2[i] != 0){
                System.out.println("Occurences of "+i+": "+arr2[i]);
            }
        }
    }
}