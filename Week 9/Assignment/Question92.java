import java.util.Scanner;
public class Question92{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
        
        String arr[]={"","","","","","","","","","","",""};
        
        int i=0;
        for (char val: input.toCharArray()){
            String s = String.valueOf(gui_map(val));
            arr[i++] = s;
        }

        String s1 = "";

        for (String val: arr) s1 = s1 + val;

        String res[] = s1.split("(?<=[-+X/=])|(?=[-+X/=])");
        int j=0;
        for (String val: res) System.out.println("j = "+j+++val);

        double num1 = Double.parseDouble(res[0]);
        double num2 = Double.parseDouble(res[2]);

        
            
        if (res[1].equals("+")) System.out.println(num1 + num2);
        else if (res[1].equals("-")) System.out.println(num1 - num2);
        else if (res[1].equals("X")) System.out.println(num1 * num2);
        else if (res[1].equals("/")) System.out.println(num1 / num2);
        




        }
	
        static char gui_map(char in){
		char out = 'N';// N = Null/Empty
		char gm[][]={{'a','.'}
					,{'b','0'}
					,{'c','='}
					,{'d','+'}
					,{'e','1'}
					,{'f','2'}
					,{'g','3'}
					,{'h','-'}
					,{'i','4'}
					,{'j','5'}
					,{'k','6'}
					,{'l','X'}
					,{'m','7'}
					,{'n','8'}
					,{'o','9'}
					,{'p','/'}};
					
		// Checking for maps
		for(int i=0; i<gm.length; i++){
			if(gm[i][0]==in){
				out=gm[i][1];
				break;
			}
		}
		return out;
	}
}
