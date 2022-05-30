import java.io.DataInputStream;
import java.io.IOException;

class InterestCalculator {
    public static void main(String args[]){
        Float pa = new Float(0);
        Float roi = new Float(0);
        int noy = 0;

        DataInputStream in = new DataInputStream(System.in);
        String temp="";

        System.out.println("Enter Principal Amount : ");
        System.out.flush();
        try{
            temp = in.readLine();
        }
        catch(Exception e){
            ;
        }
        pa = Float.valueOf(temp);

        System.out.println("Enter the Rate of Interest : ");
        System.out.flush();
        try {
            temp = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        roi = Float.valueOf(temp);

        System.out.println("Enter no of Years");
        System.out.flush();
        try {
            temp = in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        noy = Integer.parseInt(temp);

        float interest = pa*roi*noy;
        System.out.println("Total Interest : "+interest);
    }
}