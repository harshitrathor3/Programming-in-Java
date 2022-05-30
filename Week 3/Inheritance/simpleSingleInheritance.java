class Point2d{
    int x, y;

    Point2d(int x, int y){
        this.x = x; this.y = y;
    }

    void display(){
        System.out.println("x = "+x+" y = "+y);
    }
}

class Point3d extends Point2d{
    /*Point3d(int x, int y) {
        super(x, y);
    }*/

    int z;

    Point3d(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void display(){
        System.out.println("x = "+x+" y = "+y+" z = "+z);
    }
}

class simpleSingleInheritance{
    public static void main(String args[]){
        // Point2d p1 = new Point2d(3, -4);
        // Point3d p2 = new Point3d(1, 2, 100);

        // p1.x = 10;
        // p1.y = 20;

        Point2d p = new Point2d(3, -4);
        p.display();

        Point3d q = new Point3d(0, 0, 0);
        q.display();

        Point2d x = (Point2d) q;
        System.out.println("here");
        x.display();

     /*   p1.display();
        // System.out.println("Point2d p1 is "+p1.display());

        p2.x = 100;
        p2.y = 200;
        p2.z = 300;
        p2.display();*/
        // System.out.println("Point3d p2 is "+p2.display());

    }
}