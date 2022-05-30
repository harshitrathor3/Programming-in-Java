public class Question{
    public static void main(String[] args) {
        try{
            int a = 5/0;
            System.out.print("a ");
        }
        catch(ArithmeticException ae){
            System.out.print("Arithmetic Exception ");
        }
        catch(Exception e){
            System.out.print(" Exception ");
        }
        System.out.print("Hello World");
    }
}