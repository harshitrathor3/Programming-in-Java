import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
        int result = 0;
        int sum=0;
        while (num>0){
            int temp=num%10;
            int n1=temp*temp*temp;
            sum+=n1;
            num-=temp;
            num/=10;
        }
        if (sum==n)
            result=1;
        System.out.print(""+result);
        sc.close();
    }
}
