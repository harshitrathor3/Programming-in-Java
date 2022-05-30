// import java.lang.Math;

class Calculator{
    double i;
    double x = Math.sqrt(i);
}

class Example{
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.i=20;
        // c.x=Math.sqrt(c.i);      My way to get correct output
        //                          But why this program is giving 0 instead sqrt(20)
        System.out.println("Square root of "+c.i+" is "+c.x);
    }
}