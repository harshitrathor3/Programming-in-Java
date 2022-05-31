import java.util.*;
public class Question5 {  
    public static void main(String[] args) { 
       try{	
	    String s1="NPTELJAVA"; 
            Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
            char c='a';
            // s1.replace(s1.charAt(n),c);
            // System.out.println(s1.charAt(n));
            System.out.println(s1.replaceFirst(s1.substring(n, n+1),String.valueOf(c)));
            System.out.println(s1.substring(n, n+1));
            
            
       }

    catch (Exception e){
        System.out.println("exception occur");
        }	   
    }  
} 