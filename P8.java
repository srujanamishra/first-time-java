import java.util.Scanner;
import java.io.*;

interface RefInterface {
    void InterfaceMethod();
}

class ChildClass implements RefInterface{
    public void InterfaceMethod(){
        System.out.println("Interface implemented method called.");
    }
}

public class P8{
    public static void main(String[] args){
        ChildClass c = new ChildClass();
        RefInterface r = c;
        r.InterfaceMethod();
    }
}