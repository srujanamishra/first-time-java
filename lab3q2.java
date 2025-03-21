class Employee{
    int emp_id;
    String name;
    static String company_name = "Google";
    static void Change(){
        company_name = "Amazon";
    }
    void Display(){
        System.out.println("Employee ID: "+emp_id);
        System.out.println("Employee Name: "+name);
        System.out.println("Company Name: "+company_name);
    }
}
public class lab3q2{
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.emp_id = 128;
        emp1.name = "ayush nayak";
        Employee emp2 = new Employee();
        emp2.emp_id = 129;
        emp2.name = "atul rathi";
        emp1.Change();
        emp1.Display();
        emp2.Display();
    }
}
