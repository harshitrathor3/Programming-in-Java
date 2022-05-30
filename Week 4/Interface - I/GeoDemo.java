import static java.lang.System.out;

public class GeoDemo {
    public static void main(String[] args) {
        Geometry [] geoObjects = new Geometry[3];

        geoObjects[0] = new Circle(2.0);
        geoObjects[1] = new Rectangle(1, 3);
        geoObjects[2] = new Ellipse(4, 2);

        double totalArea=0;
        for (int i=0; i<3; i++){
            totalArea+=geoObjects[i].area();
            out.println(geoObjects[i].circumference());
            
        }
        out.println();
        
        System.out.println("Total Area : "+totalArea);
        
    }
}
