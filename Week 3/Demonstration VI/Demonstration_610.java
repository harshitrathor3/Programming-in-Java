abstract class Base2{
    void fun(){
        System.out.println("Base fun is called");
    }
}

class Derived2 extends Base2{
    Derived2(){
        super.fun();
        System.out.println("Derived constructor is called");
    }
    void fun(){
        super.fun();
        System.out.println("Derived fun is called");
    }
}

public class Demonstration_610 {
    public static void main(String[] args) {
        Derived2 d = new Derived2();
        d.fun();
    }
}
