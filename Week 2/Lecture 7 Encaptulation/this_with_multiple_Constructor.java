class Circle{
    double x,y;
    double r;

    Circle(double x, double y, double r){
        this.x=x; this.y=y; this.r=r;
        // this(x,y,r);
    }

    Circle(double r){
        this(0,0,r);
    }

    Circle (Circle c){
        this(c.x, c.y, c.r);
    }

    Circle(){
        this(0,0,1);
    }

    double circumference(){
        return 2*3.14159*r;
    }

    double area(){
        return 3.14159*r*r;
    }

}


class this_with_multiple_Constructor {
    public static void main(String args[]){
        Circle1 c1= new Circle1(3,4,5);
        Circle1 c2 = new Circle1(10);
        Circle1 c3 = new Circle1(c2);
        Circle1 c4 = new Circle1();

        System.out.println("Circumference of Circle : "+c1.circumference());
        System.out.println("Area of Circle : "+c1.area());
        System.out.println("Ciecumference of Another Circle : "+c2.circumference());
        System.out.println("Area of Another Circle : "+c2.area());
        System.out.println("Circumference of Circle : "+c3.circumference());
        System.out.println("Area of Circle : "+c3.area());
        System.out.println("Ciecumference of Another Circle : "+c4.circumference());
        System.out.println("Area of Another Circle : "+c4.area());
    }
}
