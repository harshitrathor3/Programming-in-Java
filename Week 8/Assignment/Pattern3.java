import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
        int t=0;
        int num, sum=0;
        if (n%2==0) num = 2*n-1;
        else num = 2*n-2;
        for (int i=0; i<n; i++){

            for (int k=2*n-2; k>t; k--)
                System.out.print(" ");

            for (int j=-1; j<2*i; j++){
                System.out.print(j+2+" ");
                sum+=j+2;
            }
            System.out.println();
            t+=2;
        }
        System.out.println(sum);
    }
}