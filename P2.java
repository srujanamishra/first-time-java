import java.util.Scanner;
abstract class Shape{
    abstract float calcArea();
}

class Triangle extends Shape{
    float height;
    float base;
    Triangle(float h,float b){
        height = h;
        base = b;
    }
    float calcArea(){
        return 0.5f*height*base;
    }
}

class Circle extends Shape{
    float radius;
    Circle(float r){
        radius = r;
    }
    float calcArea(){
        return (22.0f/7f)*radius*radius;
    }
}
public class P2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        float h,b;
        System.out.print("Enter base and height of the triangle: ");
        b = s.nextFloat();
        h = s.nextFloat();
        Triangle tr = new Triangle(h,b);
        System.out.println("Area of triangle: "+tr.calcArea());
        System.out.print("Enter radius of the circle: ");
        float r = s.nextFloat();
        Circle cr = new Circle(r);
        System.out.println("Area of Circle: "+cr.calcArea());
    }
}