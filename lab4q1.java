import java.util.Scanner;
public class lab4q1 {
    int mark1,mark2,mark3;
    public float avg ;
    public void getGrade(){
        avg = (mark1+mark2+mark3)/3f;
        if(avg >= 90 && avg<=100){
            System.out.println("Grade: O");
        }
        else if(avg >= 80 && avg<90){
            System.out.println("Grade: E");
        }
        else if(avg >= 70 && avg<80){
            System.out.println("Grade: A");
        }
        else if(avg >= 60 && avg<70){
            System.out.println("Grade: B");
        }
        else if(avg >= 50 && avg<60){
            System.out.println("Grade: C");
        }
        else if(avg >= 40 && avg <50){
            System.out.println("Grade: D");
        }
        else if(avg >= 0 && avg <40){
            System.out.println("Grade: F");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    public static void main(String[] args) {
        lab4q1 obj = new lab4q1();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of first subject");
        obj.mark1 = sc.nextInt();
        System.out.println("Enter marks of second subject");
        obj.mark2 = sc.nextInt();
        System.out.println("Enter marks of third subject");
        obj.mark3 = sc.nextInt();
        obj.getGrade();
        System.out.println(obj.avg);
    }
}
