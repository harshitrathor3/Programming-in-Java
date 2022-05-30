class Ellipse1 implements GeoAnalyzer{
    double major;
    double minor;

    Ellipse1(double d, double e){
        major = d;
        minor = e;
    }

    public double area(){
        return pi*major*minor;
    }

    public double perimeter(){
        return pi*(major+minor);
    }
}