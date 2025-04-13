import java.util.Scanner;
class Customer {
    int cell;
    String name;
    int age;
    int pkg;
    void getDetails(){
        System.out.println("Customer Cell: "+cell);
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer Package: "+pkg);
    }
}
public class lab4q7 {
    public static void main(String[] args) {
        lab4q7 arrCust[] = new lab4q7[n];
        for(int i = 0 ; i<3 ; i++){
            arrCust[i] = new lab4q7();
            System.out.println("Enter Customer Cell");
            arrCust[i].cell = sc.nextInt();
            System.out.println("Enter Customer Name");
            sc.nextLine();
            arrCust[i].name = sc.nextLine();
            System.out.println("Enter Customer Age");
            arrCust[i].age = sc.nextInt();
            System.out.println("Enter Customer Package");
            arrCust[i].pkg = sc.nextInt();
        }
        for(int i = 0 ; i <3 ; i++){
            System.out.println("Details of the Toy "+(i+1));
            arrCust[i].getDetails();
            System.out.println();
        }
    }
}
