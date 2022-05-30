abstract class Base{
    abstract void fun();
}

class Derived extends Base{
    void fun(){
        System.out.println("Derived fun is called");
    }
}

public class Demonstration_68 {
    public static void main(String[] args) {
        Base b = new Derived();
        b.fun();
    }
}
