class Bike{
    void run(){System.out.println("Running...");}
}

class Splender extends Bike{
    void run(){System.out.println("Running safely with 60km/s");}
}

public class Up_Casting {
    public static void main(String args[]){
        Splender b1 = new Splender();
        b1.run();

        Bike b2 = new Bike();
        b2.run();

        Bike b3 = new Splender();    //Up Casting
        b3.run();
    }
}
