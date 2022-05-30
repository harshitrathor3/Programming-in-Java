public class FinallyDemo {
    public static void main(String[] args) {
        int i = 0;

        String gretings [] = {"Hello Twinkle", "Hello Java", "Hello World"};

        while (i<4){
        try{
            System.out.println(gretings[i++]);
        }
        catch(Exception e){
            System.out.println(e.toString());
            System.out.println(e);
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("You should quit and reset i < 3");
        }
    }
    }
}
