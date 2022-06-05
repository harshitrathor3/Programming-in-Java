import java.util.Scanner;
public class Question94{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
        String str;
        StringBuffer s;
        for (int i=0; i<5; i++){
            str = sc.next();
            s = new StringBuffer(str);
            System.out.println(s.reverse());
            
        }
        
    }
}