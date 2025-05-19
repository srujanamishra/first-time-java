public class P11 {
    class InnerClass{
        public InnerClass(){}
        void Show(){
            System.out.println("Inner Class Show() method called.");
        }
    }
    public static void main(String[] args){
        P11 e = new P11();
        InnerClass ic = e.new InnerClass();
        ic.Show();
    }
}