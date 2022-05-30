
class Rectangle1 implements GeoAnalyzer{
    float legth;
    float width;

    Rectangle1(float l, float w){
        legth = l;
        width = w;
    }

    public double area(){
        return pi*legth*width;
    }

    public double perimeter(){
        return pi*(legth+width);
    }
}