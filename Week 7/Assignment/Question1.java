import java.util.Scanner;

public class Question1{ 
    public static void main (String[] args){
   
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int sum = num1 + num2 + num3 ;
        
        System.out.println(sum);
    }
  }