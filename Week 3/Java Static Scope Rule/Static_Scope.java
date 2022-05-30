class Static_Scope {
    public static void main(String args[]){

        int x = 10;

        if (x==10){
            int y = 20;
            System.out.println("x and y inside if is : "+x+" "+y);
            x = y*2;
        }

        //y = 100;    produce error bcz y declared in if
        System.out.println("x is "+x);
    }
}
