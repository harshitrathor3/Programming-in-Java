public class SimpleFactorial {
    int n;

    public static void main(String[] args){

        int fact = 1;
        int n = Integer.parseInt(args[0]);

        if (n==0 || n==1){
            System.out.println(fact);
            return;
        }

        for (int i =1; i<=n; i++){
            fact = fact * i;
            // System.out.println(""+i);
        
        }
        System.out.println(fact);
        return;

    }
}
