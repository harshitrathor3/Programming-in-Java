class Circle1 implements GeoAnalyzer{
    float radius;

    Circle1 (float r){
        radius = r;
    }

    public double area(){
        return pi*radius*radius;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

    public double radius_square(){
        return radius*radius;
    }
}