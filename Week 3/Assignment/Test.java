import java.util.Scanner;

class Shape{
    double length, breadth;

    Shape(double l, double b){
        length = l;
        breadth = b;
    }

    Shape(double len){    
        length = breadth = len;
    }

    double calculate(){// To calculate the area of a shape object
        return length * breadth ;
    }
}

public class Test extends Shape{

    double height;
    Test(double l, double h){
        super(l);
        height = h;

    }

    Test(double l, double b, double h){
        super(l, b);
        height = h;
    }

    double calculate(){
        return length*breadth*height;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);//Create an object to read                                                               
                                              //input
        double l=sc.nextDouble(); //Read length
        double b=sc.nextDouble(); //Read breadth	
        double h=sc.nextDouble(); //Read height
        Test myshape1 = new Test(l,h);
        Test myshape2 = new Test(l,b,h);
        double volume1;
        double volume2;
        volume1 = myshape1.calculate();
        volume2=myshape2.calculate();
        System.out.println(volume1);
        System.out.println(volume2);
        }
}
