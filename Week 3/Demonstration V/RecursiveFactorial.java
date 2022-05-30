
public class RecursiveFactorial {
    static int num;
    static long factorial(int n){
        if (n==0) return 1;
        return (n*factorial(n-1));
        // return (n*factorial(n-1));
    }

    public static void main(String args[]){
        num = Integer.parseInt(args[0]);
        System.out.println("Factorial of num is :  "+factorial(num));
    }
}
