abstract class Base1{
    Base1(){
        System.out.println("Base constructor is called");
    }
}

class Derived1 extends Base1{
    
    Derived1(){
        // super();
        System.out.println("Derived Construction is called");
    }

    void fun(){
        System.out.println("Derived fun is called");
    }
}

public class Demonstration_69 {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
        d.fun();
    }
}
