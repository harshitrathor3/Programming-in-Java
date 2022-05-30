abstract class Base3{
    final void fun(){
        System.out.println("Final fun is called");
    }
}

class Derived3 extends  Base3{}

public class Demonstration_612a {
    public static void main(String[] args) {
        Base3 b = new Derived3();
        b.fun();
    }
}
