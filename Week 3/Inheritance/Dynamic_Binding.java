class A{
    void callMe(){
        System.out.println("I am from A");
    }
}
class B extends A{
    void callMe(){
        System.out.println("I am from B");
    }
}

public class Dynamic_Binding {
    public static void main(String[   ] args) {
        A a = new B();
        a.callMe();

        B b = new B();
        b.callMe();

        A a1 = new A();
        a1.callMe();
    }
}
