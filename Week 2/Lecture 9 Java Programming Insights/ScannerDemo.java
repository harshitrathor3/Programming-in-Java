import java.util.Scanner;

public class ScannerDemo{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter First No : ");

        int num1,num2;

        num1 = s.nextInt();

        System.out.print("Enter Second No : ");

        num2 = s.nextInt();

        System.out.println("Sum of nos is : "+(num1+num2));
    }
}