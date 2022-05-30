import java.lang.Math;
import java.util.Vector;
import java.util.ArrayList;

class Calculator{
    double i;
    double x;

    void p(){
        x = Math.sqrt(i);
    }
}

class Demostration_81{
    public static void main(String[] args){
        Vector v = new Vector();
        ArrayList al = new ArrayList<>();
        Calculator c = new Calculator();
        c.i = 25;
        c.p();
        System.out.println(c.x);
        c.i=20;
        c.p();
        System.out.println(c.x);
    }
}