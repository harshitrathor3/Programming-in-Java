class rect{
    int l,b;

    int area(){
        return l*b;
    }

    int perimeter(){
        return 2*(l+b);
    }

   /* void setrect(int l, int b){
        this.l=l; this.b=b;
    }*/

    rect(int l,int b){
        this.l=l;
        this.b=b;
    }

    rect(){
        this(1,1);
    }

 /*   rect(int l){
        this.l=l;
        b=l+1;
    }
*/
    // rect(int b){
    //     l=b*2;
    //     this.b=b;
    // }

    rect(rect r){
        //l=r.l;
        //b=r.b;
        this(r.l, r.b);
    
    }

    rect(int l){
        this(l,l*10);
    }
}



class Rectangle {
    public static void main(String args[]){
        rect r1 = new rect(4, 5);
        rect r2 = new rect();
        rect r3 = new rect(3);
        rect r4 = new rect(r1);
        


        System.out.println("Area of Rectangle : "+r1.area());
        System.out.println("Perimeter of Rectangle : "+r1.perimeter());
        System.out.print("\n");

        System.out.println("Area of Rectangle : "+r2.area());
        System.out.println("Perimeter of Rectangle : "+r2.perimeter());
        System.out.print("\n");

        System.out.println("Area of Rectangle : "+r3.area());
        System.out.println("Perimeter of Rectangle : "+r3.perimeter());
        System.out.print("\n");

        System.out.println("Area of Rectangle : "+r4.area());
        System.out.println("Perimeter of Rectangle : "+r4.perimeter());
        System.out.print("\n");
    }
}