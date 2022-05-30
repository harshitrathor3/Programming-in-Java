class Animal1{
    void eat() {System.out.println("Eating......");}
}

class Dog1 extends Animal1{
    void eat(){System.out.println("Eating Bread");}
    void bark(){System.out.println("Barking.......");}

    void work(){
        bark();
        super.eat();
        eat();
    }
}

public class TestSuper2 {
    public static void main(String a[]){
        Dog1 d = new Dog1();
        d.work();
    }    
}
