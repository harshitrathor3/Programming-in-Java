//Multilevel Inheritance
class Box1{
    private double w;
    private double l;
    private double h;

    Box1(double w, double l, double h){
        this.w = w;  this.l = l;  this.h = h;
    }

    double volume(){
        return l*w*h;
    }
}

class BoxWeight1 extends Box1{
    double weight;

    BoxWeight1(double w, double h, double l, double weight){
        super(w, l, h);
        this.weight = weight;
    }
}

class Shipment extends BoxWeight1{
    double cost;
    
    Shipment(double w, double l, double h, double weight, double cost){
        super(w, h, l, weight);
        this.cost = cost;
    }
}

class Demonstration_67{
    public static void main(String[] args) {
        Shipment s1 = new Shipment(1, 2, 3, 4, 5);
        Shipment s2 = new Shipment(10, 20, 30, 40, 50);

        System.out.println(s1.volume());
        System.out.println(s1.weight);
        System.out.println(s1.cost);
        System.out.println(s2.volume());
        System.out.println(s2.weight);
        System.out.println(s2.cost);
    }
}