class Animal{
    String color = "White";
}

class Dog extends Animal{
    String color = "Black";

    void print_color(){
        System.out.println(color);
        System.out.println(super.color);
    }
}

public class TestSuper1 {
    public static void main(String args[]){
        Dog d = new Dog();
        d.print_color();
    }
}