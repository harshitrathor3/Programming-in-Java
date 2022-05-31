import java.io.DataInputStream;
import java.io.IOException;

class InterestCalculator{
    public static void main(String[] args) throws IOException{
        Float pa = new Float(0);
        Float roi = new Float(0);
        int y = 0;


        DataInputStream in = new DataInputStream(System.in);
        String temp;

        System.out.println("Enter Principal amount : ");
        System.out.flush();
        temp = in.readLine();
        pa = Float.valueOf(temp);

        System.out.println("Enter Rate of Interest : ");
        System.out.flush();
        temp = in.readLine();
        roi = Float.valueOf(temp);

        System.out.println("Enter no of Years : ");
        System.out.flush();
        temp = in.readLine();
        y = Integer.valueOf(temp);

        float interest = pa * roi * y;
        
        System.out.println("Total Interest : "+interest);
        
    }
}