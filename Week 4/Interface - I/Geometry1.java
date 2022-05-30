public class Geometry1 {
    static void display(double x, double y){
        System.out.println("Area : "+x+" Perimeter : "+y);
    }

    public static void main(String[] args) {
        Circle1 c = new Circle1((float) 5.2);
        Ellipse1 e = new Ellipse1(4.5, 3.6);
        Rectangle1 r = new Rectangle1((float)6.5, (float)4.3);

        GeoAnalyzer geoItem;
        geoItem = c;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = e;
        display(geoItem.area(), geoItem.perimeter());
        geoItem = r;
        display(geoItem.area(), geoItem.perimeter());
    }
}
