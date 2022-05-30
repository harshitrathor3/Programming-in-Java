class Array_Declaration {
    public static void main(String args[]){
        int x[]={12,3,6,9};
        double []y={2.5,3.4,4.5};
        // x = new int [10];
        // y= new float [5];
        // int z[] = new int [13];
        for(int i=0;i<x.length;i++)
            System.out.println(x[i]);
        System.out.println("One loop ended");
        for(int i=0;i<y.length;i++)
            System.out.println(y[i]);
        
        System.out.println("Sum of lenght of two arra is "+(x.length+y.length));

    }
}
