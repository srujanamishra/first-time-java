import java.util.Scanner;

public class P3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        float r = s.nextFloat();
        Shape cr = new Circle(r);
        System.out.println("Area of Circle: "+cr.calcArea());
    }
}