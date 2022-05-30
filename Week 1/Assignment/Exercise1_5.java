import java.util.Scanner;

public class Exercise1_5 {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        s = input.nextInt();

        int arr[]= new int[s];
        for(i=0;i<s;i++)
            arr[i]=input.nextInt();
        result = arr[0];
        int sum=0;
        for(i=0;i<s;i++){
            sum+=arr[i];
            if (arr[i]>result)
                result=arr[i];
        }
        mark_avg=sum/i;
        System.out.println(""+result);
        System.out.print(""+mark_avg);
        input.close();
    }
}