public class Circle {
    static int circlecount = 0;
    double x, y, r;

    public Circle(double x, double y, double r){
        this.x = x; this.y = y; this.r = r;
        circlecount++;
    }

    public Circle(double r){
        this(0, 0, r);
        circlecount++;
    }

    public Circle(Circle c){
        this(c.x, c.y, c.r);
        circlecount++;
    }

    public Circle(){
        this(0,0,10);
        circlecount++;
    }

    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        Circle c3 = new Circle(c1);

        System.out.println("c1 : "+c1.circlecount+" c2 : "+c2.circlecount+" c3 : "+c3.circlecount);
        System.out.println("We can take value of static varable in static way as "+Circle.circlecount);
    }
}