import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
        
        char arr[] = input.toCharArray();
        String result[] = input.split("(?<=[-+*/])|(?=[-+*/])");

        int num1 = Integer.parseInt(result[0]);
        int num2 = Integer.parseInt(result[2]);

        for (String val:result) System.out.println(val);
        // System.out.println(result[1].getClass().getName());
         
        char op;
        if (result[1].equals("+")) System.out.println(num1+"+"+num2+"+"+(num1 + num2));
        else if (result[1].equals("-")) System.out.println(num1+"-"+num2+"="+(num1 - num2));
        else if (result[1].equals("*")) System.out.println(num1+"*"+num2+"+"+(num1 * num2));
        else if (result[1].equals("/")) System.out.println(num1+"/"+num2+"+"+(num1 / num2));

        
          
        }
    }
