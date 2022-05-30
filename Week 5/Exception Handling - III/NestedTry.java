import javax.swing.JOptionPane;

public class NestedTry{
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 42 / a;
            System.out.println(a);

            if (a==1)
                a/=a-a;
            try{
                if (a==2){
                    int c [ ] = {1};
                    c[a] = 99;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                JOptionPane.showMessageDialog(null,"Array Index out of Bound "+e);
            }
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,"Divide by 0 "+e);
        }
    }
}