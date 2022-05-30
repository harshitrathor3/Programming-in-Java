interface I1{
    int i=1;
    void printI1();
}

interface I2{
    int j=2;
    void printI2();
}
class A1{
    protected int j = 1000;
    void print(){
        System.out.println("I am from A1 : "+j);
    }
}

class B extends A1 implements I2{
    public void printI2(){
        System.out.println("I am from I2 : "+super.j+I2.j);
    }

    public void printB(){
        super.print();
        
    }
}


class A implements I1, I2{

    int aval=999;
    public void printI2() {
        System.out.println("I am from I1 : "+i);
    }

    public void printI1() {
        System.out.println("I am from I1 : "+i);        
    }

    public void printA(){
        System.out.println("I am from A : "+(aval=i+j));
    }
    
}

public class Demonstration_98{
    public static void main(String[] args) {
        A a = new A();
        a.printA();
        a.printI1();
        a.printI2();

        System.out.println("\n\n\n");

        B b  = new B();
        b.printB();
    }
}