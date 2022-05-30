abstract class Base4{
    final void fun(){
        System.out.println("Fun is called");
    }
}

class Derived4 extends Base4{
    Derived4(){
        System.out.println("Derived cosntructor");
    }
    void fun(){
        System.out.println("Not possible");
    }
}

public class Demonstration_612b {
    public static void main(String[] args) {
        Base4 b = new Derived4();
        b.fun();
    }
}
