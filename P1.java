import java.lang.String;
import java.util.Scanner;
abstract class Student{
    int roll_no;
    long registration_no;
    abstract void GetInput();
}

class kiitian extends Student{
    String course = "B.TECH.(COMPUTER SCIENCE AND ENGINEERING)";
    kiitian(int roll,long reg){
        roll_no = roll;
        registration_no = reg;
    }
    void GetInput(){
        System.out.println("Roll number- "+roll_no);
        System.out.println("Registration number- "+registration_no);
        GetCourse();
    }
    void GetCourse(){
        System.out.println("Course- "+course);
    }
}
public class P1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Details: ");
        int roll;
        long reg;
        System.out.print("Roll number: ");
        roll = s.nextInt();
        System.out.print("Registration number: ");
        reg = s.nextLong();
        kiitian kt = new kiitian(roll,reg);
        kt.GetInput();
    }
}