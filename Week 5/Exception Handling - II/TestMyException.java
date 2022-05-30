class MyException extends Exception{
    MyException(String message){
        super(message);
    }
}

public class TestMyException {
    public static void main(String[] args) {
        int x = 5, y = 1000;

        try{
            float z  = (float)x / (float)y;
            System.out.println(z);
            if (z<.01)
                throw new MyException("Given data are not proper");
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("It prints always");
        }
    }
}
