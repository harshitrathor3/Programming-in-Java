class Circle{
    double x,y;    //coordinate of circle
    double r;      //radius of circle

    //Method that return Circumference
    double circumference(){
        return 2*3.14159*r;
        // return 2*(22/7)*r;
    }
    //Method that return area
    double area(){
        return (22/7)*r*r;   //giving wrong area
    }
}

class Example1{
    public static void main(String argsp[]){
        Circle c = new Circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        System.out.println("Circumference : "+c.circumference());
        System.out.print("Area : "+c.area());
    }
}