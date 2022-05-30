public class Multiple_catch{
    public static void main(String[] args) {
        int i = args.length;

        try{
            String[] myString = new String[i];
            if (args[0].equals("Java"))
                System.out.println("First word is Java");
            System.out.println("No of arguments : "+i);

            int x = 10 / i;
            int y[] = {555, 999};
            y[i] = x;
        }
        catch(NullPointerException e){
            System.out.println("Null pointer exception : "+e);
        }
        catch(ArithmeticException e){
            System.out.println("Divide vy 0 exception : "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index oob exception : "+e);
        }


    }
}