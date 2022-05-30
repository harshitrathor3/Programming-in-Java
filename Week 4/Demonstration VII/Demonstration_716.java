class BasClass{
    void msg(){
        System.out.println("Hello there");
    }

    public void msg1(){
        System.out.println("Hello there");
    }

    private void msg2(){
        System.out.println("Hello there");
    }

    protected void msg3(){
        System.out.println("Hello there");
    }
}

public class Demonstration_716 extends BasClass{

    void msg(){
        System.out.println("Hello there");
    }

    public void msg1(){
        System.out.println("Can we do that or not");
    }

    private void msg2(){
        System.out.println("Hello there");
    }

    protected void msg3(){
        System.out.println("Hello there");
    }
    public static void main(String[] args) {
        
        BasClass bc = new BasClass();
        bc.msg();
        bc.msg1();
        // bc.msg2();
        bc.msg3();

        System.out.println();

        Demonstration_716 d = new Demonstration_716();
        d.msg();
        d.msg1();
        d.msg2();
        d.msg3();

    }
}
