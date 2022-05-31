import java.io.*;
import java.util.*;

public class Question4{  
    public static void main(String[] args) { 
	  int c=0;
         try{
            InputStreamReader r=new InputStreamReader(System.in);  
            BufferedReader br=new BufferedReader(r);  
            String s1 = br.readLine();

            

            char arr[] = {'a','e','i','o','u','A','E','I','O','U'};
            for (int i=0; i<s1.length(); i++){
                char chr = s1.charAt(i);
                
                for (int j=0; j<arr.length; j++)
                    if (chr==arr[j])
                        c++;
            }



            System.out.println(c); 
        }
        catch (Exception e){
          System.out.println(e);
         }	   
     }  
 } 