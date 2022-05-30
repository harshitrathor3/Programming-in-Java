public class RecursiveGCD {
    int m, n;
    int gcd(int m, int n){
        /*if (m<n){
            int temp = m;
            m = n;
            n = temp;
        }
        if (m%n==0)
            return n;
        return gcd(n, m%n);*/
        // System.out.println("m = "+m+" n = "+n);
        if (m>n){
            // System.out.println("here");
            return gcd(n, m);
        }
        if (m==n)
            return m;
        if (m==0)
            return n; 
        if (m==1)
            return 1;
        
         return gcd(m, n%m);
    }


    public static void main(String args[]){
        RecursiveGCD g = new RecursiveGCD();
       g.n = Integer.parseInt(args[0]);
        g.m = Integer.parseInt(args[1]);

        System.out.println(g.gcd(g.n, g.m));

    }
}
