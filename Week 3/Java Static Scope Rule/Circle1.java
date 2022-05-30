public class Circle1 {
    double x, y, r;

    public Circle1 bigger(Circle1 c){
        if (c.r>r)
            return c;
        else
            return this;
    }

    public static Circle1 bigger(Circle1 a, Circle1 b){
        if (a.r>b.r)
            return a;
        else
            return b;
    }

    public static void main(String args[]){
 
        Circle1 a = new Circle1();
        a.r = 5.0;
        Circle1 b = new Circle1();
        b.r = 3.0;

        Circle1 c = a.bigger(b);
        Circle1 d = Circle1.bigger(a, b);

        System.out.println(a.r);
        System.out.println(b.r);
        System.out.println(c.r);
        System.out.println(d.r);
    }
}