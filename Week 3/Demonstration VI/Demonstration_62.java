class Box{
    double l, b, h;

    Box(){
        l=0; b=0; h=0;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double vol(){
        return l*b*h;
    }
}

class BoxWeight extends Box{
    double weight;

    BoxWeight(){
        super();
        weight = 0;
    }

    BoxWeight(double l, double b, double h, double weight){
        super(l, b, h);
        this.weight = weight;
    }
}

public class Demonstration_62 {
    public static void main(String[] args) {
        Box b = new Box(10, 20, 30);
        System.out.println(b.vol());

        BoxWeight bw = new BoxWeight(100, 200, 300, 500);
        System.out.println(bw.vol());
        System.out.println(bw.weight);

        System.out.println("Using Demostration 63\n\n\n\n");
        b = bw;
        System.out.println(b.vol());
        // System.out.println(b.weight);
    }
}