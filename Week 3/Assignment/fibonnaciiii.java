import java.util.Scanner;

public class fibonnaciiii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int f1=0, f2=1;
        int temp;
        for (int i=2; i<n; i++){
            temp = f1;
            f1 = f2;
            f2 = temp+f2;
        }
        System.out.println(f2);
    }
}
