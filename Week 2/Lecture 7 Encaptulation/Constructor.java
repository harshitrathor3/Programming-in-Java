class Circle{
    double x,y;
    double r;

    double circumference(){
        return 2*3.14159*r;
    }

    double area(){
        return 3.14159*r*r;
    }

    Circle(double a,double b,double c){
        x = a;
        y = b;
        r = c;
    }
}



class Constructor {
    public static void main(String args[]){
        Circle c1 = new Circle(4,5,6);
        Circle c2 = new Circle(-4,8,10);

        System.out.println("Circumference of Circle : "+c1.circumference());
        System.out.println("Area of Circle : "+c1.area());
        System.out.println("Ciecumference of Another Circle : "+c2.circumference());
        System.out.println("Area of Another Circle : "+c2.area());
 
    }
}
