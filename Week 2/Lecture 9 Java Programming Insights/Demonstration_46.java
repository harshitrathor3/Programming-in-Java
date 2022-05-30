import java.util.Scanner;

public class Demonstration_46 {
    public static void main(String args[]){
        System.out.print("Enter the radius : ");
        Scanner s = new Scanner(System.in);
        double radius = s.nextDouble();

        double area = 3.14159*radius*radius;

        System.out.print("Area is : "+area);

        s.close();
    }
}
