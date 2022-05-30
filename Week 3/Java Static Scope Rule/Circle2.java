class Circle2 {
    static double x, y, r;

    Circle2(double r){
        this.r = r;
    }

    public static class Point{
        double x, y;

        Point(double x, double y){
            this.x = x;
            this.y = y;
        }

        void display(){
            System.out.println("(x,y) : ("+this.x+" , "+this.y+" )");
        }
    }

    public boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt(dx*dx+dy*dy);

        if (distance < r)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        Circle2 a = new Circle2(2.0);
        Point pa = new Point(1, 1);
        pa.display();

        System.out.println("Point (1,2) inside circle of radius 2 or not : "+a.isInside(pa));

        Circle2 b = new Circle2(1.0);
        Point pb = new Point(3, 3);
        pa.display();

        System.out.println("Point (3, 3) inside circle of radius 1 or not : "+b.isInside(pb));
    }
}
