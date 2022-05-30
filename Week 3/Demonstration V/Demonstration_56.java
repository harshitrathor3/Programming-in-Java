public class Demonstration_56 {
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        boolean ans = true;
        for (int i=2; i<=num/2; i++){
            if (num%i==0){
                ans = false;
                break;
            }
        }
        if (ans) System.out.println("Prime no");
        else System.out.println("Not Prime no");
    }
}
