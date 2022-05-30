class Circle1{
    double x,y;
    double r;

    Circle1(double x,double y,double r){
        this.x=x; this.y=y;this.r=r;
    }

    Circle1(double r){
        x=0; y=0; this.r=r;
    }

    Circle1(Circle1 c){
        x=c.x; y=c.y; r=c.r;
    }

    Circle1 (){
        x=0; y=0; r=1;
    }


    double circumference(){
        return 2*3.14159*r;
    }

    double area(){
        return 3.14159*r*r;
    }
}



class Multiple_Constructor {
   public static void main(String args[]){
    Circle1 c1= new Circle1(3,4,5);
    Circle1 c2 = new Circle1(10);
    Circle1 c3 = new Circle1(c1);
    Circle1 c4 = new Circle1();

    

    System.out.println("Circumference of Circle : "+c1.circumference());
    System.out.println("Area of Circle : "+c1.area());
    System.out.println("Ciecumference of Another Circle : "+c2.circumference());
    System.out.println("Area of Another Circle : "+c2.area());
    System.out.println("Circumference of Circle : "+c3.circumference());
    System.out.println("Area of Circle : "+c3.area());
    System.out.println("Ciecumference of Another Circle : "+c4.circumference());
    System.out.println("Area of Another Circle : "+c4.area());
   }    
}