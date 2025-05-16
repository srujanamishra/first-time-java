import java.util.Scanner;
import java.lang.String;
interface Employee7{
    void getDetails();
}
interface Manager7 extends Employee7{
    void getDeptDetails();
}

class Head implements Manager7{

    public int EmployeeID;
    public String EmployeeName;
    public int DeptID;
    public String DeptName;

    Head(int eID,String eName,int dId,String dName){
        EmployeeID = eID;
        EmployeeName = eName;
        DeptName = dName;
        DeptID = dId;
    }
    public void getDetails() {
        System.out.println("Employee ID: "+EmployeeID);
        System.out.println("Employee Name: "+EmployeeName);
    }
    public void getDeptDetails() {
        System.out.println("Department ID: "+DeptID);
        System.out.println("Department Name: "+DeptName);
    }
}

public class P7 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int eID;
        int dID;
        String eName;
        String dName;
        System.out.print("Enter Employee ID: ");
        eID = s.nextInt();
        s.nextLine();
        System.out.print("Enter Employee Name: ");
        eName = s.nextLine();
        System.out.print("Enter Department ID: ");
        dID = s.nextInt();
        s.nextLine();
        System.out.print("Enter Department Name: ");
        dName = s.nextLine();
        Head h = new Head(eID,eName,dID,dName);
        h.getDetails();
        h.getDeptDetails();
    }
}