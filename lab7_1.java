package General;
public class Employee{
    protected int empid;
    private String ename;
    public float basic;
    public float DA = 0.8f;
    public float HRA = 0.15f;
    public float earn = 0;
    public void earnings(){
        earn = basic + basic*DA + basic*HRA;
    }
    
}