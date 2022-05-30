class A{
    int i, j;
    
    void show(){
        System.out.println("i = "+i+" j = "+j);
    }
}

class B extends A{
    int k;
    void showthis(){
        super.show();
        System.out.println(" k = "+k);
    }

    void sum(){
        System.out.println("Sum = "+(i+j+k));
    }
}

class Demonstration_61{
    public static void main(String[] args) {
        A a = new A();
        a.i = 1;
        a.j = 2;
        a.show();

        B b = new B();
        b.i = 10;
        b.j = 20;
        b.k = 30;
        b.show();
        b.showthis();
        b.sum();
    }
}