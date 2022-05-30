class Box{
    int x = 10;
    int y = 20;
    int w = 30;

    float area(){
        return (2*(x*y+y*w+w*x));
    }
}

class Circle{
    int x = 0;
    int y = 0;
    int r = 5;

    double area(){
        return Math.PI*r*r;
    }
}

class GeoClass{
    public static void main(String args[]){

        float x = (float)1.1;
        //float x = 1.3;   giving error of type mismatch
        float y = (float)12.4;
        //float y = 4.5;   giving error of type mismatch
        Box b = new Box();
        Circle c = new Circle();

        System.out.println("GeoClass data :  "+x+"  "+y);
        System.out.println("Box class data : "+b.x+"  "+b.y);
        System.out.println("Area of Box : "+b.area());
        System.out.println("Circle class data : "+c.x+"  "+c.y);
        System.out.println("Area of Circle : "+c.area());
    }
}