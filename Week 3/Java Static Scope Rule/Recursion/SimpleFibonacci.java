public class SimpleFibonacci {
    //  int n;
    
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        
        int f1 = 0; int f2 = 1;
        int temp;

        for (int i=0; i<n; i++){
            temp = f1 + f2;
            System.out.print(f1+" ");
            System.out.print(f2+" ");
            f1 = f2;
            f2 = temp;
        }
    }
}
