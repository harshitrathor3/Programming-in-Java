import java.util.Scanner;
public class Question3 {  
    public static void main(String[] args) { 
       try{	
	        byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
            Scanner inr = new Scanner(System.in);
	        int n = inr.nextInt();
            System.out.println(barr[n]);
            System.out.println((char)barr[n]);
       }

      catch (Exception e){
	    System.out.println("exception occur");
	    }	   
    
}

}