class student{
    int roll_no;
    static String college = "KIIT";
    String name;
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll_no);
        System.out.println("College: "+college);
    }
}
public class lab3q3 {
    public static void main(String[] args) {
        student stu1 = new student();
        stu1.name = "ayush";
        stu1.roll_no = 200;
        student stu2 = new student();
        stu2.name = "Virat";
        stu2.roll_no = 183;
        student stu3 = new student();
        stu3.name = "Kapil";
        stu3.roll_no = 175;
        stu1.Display();
        stu2.Display();
        stu3.Display();

    }
}
