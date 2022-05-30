import java.util.Scanner;
class Question1 {  //Define a class Question with two elements e1 and e2.
  Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();  //Read e1
int e2 = sc.nextInt();  //Read e2
}
public class Exercise3_5{

    static void swap(Question1 q){
        q.e1 = q.e1 + q.e2;
        q.e2 = q.e1 - q.e2;
        q.e1 = q.e1 - q.e2;
        
    }

    public static void main(String[] args) {
        //Create an object of class Question
            Question1 t = new Question1();
          //Call the method swap()
        swap(t);
        
        System.out.println(t.e1+" "+t.e2);    
    }
        
}	