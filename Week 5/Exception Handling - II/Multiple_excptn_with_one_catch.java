import java.util.Scanner;

public class Multiple_excptn_with_one_catch {
    public static void main(String[] args) {
        try{
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        System.out.println(i);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}
