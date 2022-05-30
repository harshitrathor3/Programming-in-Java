final class Bike2{

}

class Honda2 extends Bike2{
    void run(){
        System.out.println("Running safely");
    }
}

public class final_keyword {
    Honda2 h = new Honda2();
    h.run();               // this will not run and generate compile time error bcz final class can't become super class
}
