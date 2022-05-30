public class DivideZero {
    static int anyFunction(int a, int b){
        int ans=0;
        try{
         ans = a/b;
        }
        catch(ArithmeticException e){
            System.out.println("pls not provide b = 0");
            System.out.println(e);
        }
        return ans;

    }

    public static void main(String[] args) {
        int result = anyFunction(25, 0);
        System.out.println("Result : "+result);
    }
}
