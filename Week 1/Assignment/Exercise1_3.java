import java.util.Scanner;

public class Exercise1_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        n = n * 2;
        for (int i=0;i<=n;i+=2){
            // System.out.print(""+i);
            if (i%3==0)
                sum+=i;
        }
        System.out.print(""+sum);

        sc.close();

    }
    
}
