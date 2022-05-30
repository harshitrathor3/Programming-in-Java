public class temp {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        
        int f1 = 0; int f2 = 1;
        System.out.print(f1+" "+f2+" ");
        n = n - 2;
        while(n>=1){
            int temp = f1 + f2;
            System.out.print(temp+" ");
            f1 = f2;
            f2 = temp;
            n--;
        }
    }
}
