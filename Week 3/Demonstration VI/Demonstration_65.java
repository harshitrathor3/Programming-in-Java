class A1{
    int i;
}

class B1 extends A1{
    int i;

    B1(int a, int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("super i  = "+super.i+" sub class i = "+i);
    }
}

public class Demonstration_65 {
    public static void main(String[] args) {
        B1 b = new B1(4, 5);
        b.i=100;
        b.show();
    }
}
