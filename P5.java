interface Motor{
    float Capacity = 1000;
    void Run();
    void Consume();
}

class WashingMachine implements Motor{
    WashingMachine(){
        Run();
        Consume();
    }
    public void Run() {
        System.out.println("Washing machine is running.");
    }
    public void Consume() {
        System.out.println("Washing machine is consumes power.");
    }
    public void CheckCapacity(){
        System.out.println("Capacity of the Motor: "+Capacity);
    }
}
public class P5 {
    public static void main(String[] args){
        WashingMachine obj = new WashingMachine();
        obj.CheckCapacity();
    }
}