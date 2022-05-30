import java.util.Scanner;  
import java.lang.Math;
public class Exercise1_1 {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       double pi=Math.PI;
       area = pi*radius*radius;
       System.out.println(""+area);
       perimeter = 2*pi*radius;
       System.out.println(""+perimeter);
       s.close();
    }
}