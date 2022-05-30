import java.io.IOException;

public class Demonstration_57 {
    public static void main(String args[]) throws IOException{
        char choice;

        do{
            System.out.println("Help on : ");
            System.out.println(" 1 . if");
            System.out.println(" 2 . switch");
            System.out.println(" 3 . while");
            System.out.println(" 4 . do while");
            System.out.println(" 5 . for");
            choice = (char)System.in.read();
        }while(choice<'1' || choice >'5');
        System.out.println();
        switch(choice){
            case '1': 
                    System.out.println("if");
                    break;
            case '2': 
                    System.out.println("switch");
                    break;
            case '3': 
                    System.out.println("while");
                    break;
            case '4': 
                    System.out.println("do while");
                    break;
            case '5': 
                    System.out.println("for");
                    break;
        }
    }
}
