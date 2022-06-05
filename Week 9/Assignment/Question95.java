import java.util.Scanner;
public class Question95{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        String str ;
        for (int i=0; i<5; i++){
            str = sc.next();
            char arr[] = str.toCharArray();

            for (char val:arr){
                if (val=='0') System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();

        }


    }
}