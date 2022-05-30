class B{
    B(){
        this(5);
        System.out.println("Constructor initialised");
    }
    B(int x){
        System.out.println("x = "+x);
    }
}



class Demonstration_313 {
    public static void main(String args[]){
        B b = new B();
        B b1 = new B(10);
        
    }
}
