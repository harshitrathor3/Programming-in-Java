class Point2d1{
    int x, y;

    Point2d1(){
        x = 0; y = 0;
    }

    Point2d1(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Point3d1 extends Point2d1{
    double z;
    Point3d1(){
        super(); 
        z = 0;
    }

    Point3d1(int x, int y, int z){
        super(x, y);
        this.z = z;
    }
}

public class TestSuper4 {
    public static void main(String[] args) {
        Point3d1 p = new Point3d1(2, 3, 4);
        System.out.println(" x "+p.x+" y "+p.y+" z "+p.z);
    }
}