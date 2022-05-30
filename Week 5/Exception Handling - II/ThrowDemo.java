import javax.swing.JOptionPane;

public class ThrowDemo {
    static void DemoProc(){
        try{
            // int x = 5/0;
            // System.out.println(x);
            throw new InterruptedException("An Interrupt occur");
        }
        catch (InterruptedException e){
            System.out.println("Exception is caught in DemoProc()");
            // throw e;
        }
    }

    public static void main(String[] args) {
        try{
            DemoProc();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Exception caught by demoproc()");
        }
    }
}
