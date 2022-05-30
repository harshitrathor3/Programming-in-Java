import java.util.Scanner;

public class MaximumCalculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        if (b>a) System.out.printf("Between %d and %d max is %d",a,b,a);
        else System.out.printf("Between %d and %d max is %d",a,b,b);
    }
}
