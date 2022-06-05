import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n%2==0) System.out.print("Invalid line number");
        else{
            int num = n/2 + 1;
            for (int i=1; i<=num; i++){
                for (int j=0; j<num-i; j++)
                    System.out.print(" ");
                for (int k=0; k<i; k++)
                    System.out.print("* ");
                System.out.println();
            }
            num--;
            // System.out.println(num+" "+n+" "+num);
            for (int i=num; i>0; i--){
                for (int j=num-i; j>=0; j--)
                    System.out.print(" ");
                for (int k=i; k>0; k--){
                    if (k==1)
                        System.out.print("*");
                    else 
                        System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
