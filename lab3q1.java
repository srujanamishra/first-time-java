class Employee{
    public int id;
    public String name;
    public Employee(){
        id = 1234;
        name = "ayush nayak";
    }
    public Employee(int n, String Name){
        id = n;
        name = Name;
    }
}
public class lab3q1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Employee ID: "+emp.id);
        System.out.println("Employee Name: "+emp.name);
        Employee emp2 = new Employee(15,"srujana mishra");
        System.out.println("Employee ID: "+emp2.id);
        System.out.println("Employee Name: "+emp2.name);
    }
}
