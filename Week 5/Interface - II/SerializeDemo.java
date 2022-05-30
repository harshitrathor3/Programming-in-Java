import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Car1 implements Serializable{
    private String make;
    private double price;
    private String model;

    public Car1(){
        this("", "", 0.0);
    }

    public Car1(String make, String model, double price){
        this.make = make;
        this.model = model;
        this.price = price;
    }
    //rest of class un unltered
}

public class SerializeDemo{
    Car1 myToyota, anotherTyota;
    myToyota = new Car1("toyota","Carna","42312");
    ObjectOutputStream out  =getOutput();
    out.writeObjects(myToyota);
    ObjectInputStream in = getInput();
    anotherTyota = (Car1)in.readObject();
}
