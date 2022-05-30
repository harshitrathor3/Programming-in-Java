class Point{
    int x,y;

   /* Point(int x,int y){
        this.x=x;
        this.y=y;
    }*/

    void setPoint(){
        x=10;
        y=20;
    }

    void setPoint(int x, int y){
        this.x=x;
        this.y=y;
    }

}

class Demostration_34{
    public static void main(String args[]){
       // Point p = new Point(1, 2);
        Point p1 = new Point();
        Point p2 = new Point();
        p1.setPoint();
        p2.setPoint(50, 100);

        // p.x=4;
        // p.y=13;

        System.out.println("x is : "+p1.x);
        System.out.println("y is : "+p1.y);
        System.out.println("x is : "+p2.x);
        System.out.println("y is : "+p2.y);
    }
}