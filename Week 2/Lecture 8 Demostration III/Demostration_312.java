class A{
    void m(){
        System.out.println("Hello m ");
    }

    void n(){
        System.out.println("Hello n");
        this.m();
    }
}



class Demostration_312 {
    public static void main(String args[]){
        A a = new A();
        a.n();
        // a.m();
    }
}
