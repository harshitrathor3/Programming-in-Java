class Animal2{
    Animal2(){System.out.println("Animal is created");}
}

class Dog2 extends Animal2{
    Dog2(){
        // System.out.println("Hii");
        super();
        System.out.println("Dog is created");
    }
}

public class TestSuper3 {
    public static void main(String[] args) {
        Dog2 d = new Dog2();
        
        // Dog1 d1 = new Dog1();
        // d1.work();
    }
}
