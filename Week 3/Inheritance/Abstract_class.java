abstract class Bike1{
    abstract void run();
}

class Honda extends Bike1{
    // @Override
    void run(){
        System.out.println("Running Safely");
    }


    /* @Override
    void run() {
        
    }
*/
}

public class Abstract_class {
    public static void main(String[] args) {
        Bike1 obj = new Bike1();
        obj.run();
    }
}
