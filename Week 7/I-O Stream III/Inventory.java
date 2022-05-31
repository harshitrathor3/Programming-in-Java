import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
// import java.io.IOException;
import java.util.StringTokenizer;

public class Inventory {
    static DataInputStream dis = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String args[]) throws Exception{
        FileOutputStream fos = new FileOutputStream("invent.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        System.out.println("Enter Code No : ");
        st = new StringTokenizer(dis.readLine());
        int code = Integer.parseInt(st.nextToken());
        
        System.out.println("Enter no of Items : ");
        st= new StringTokenizer(dis.readLine());
        int items = Integer.parseInt(st.nextToken());

        System.out.println("Enter Cost : ");
        st= new StringTokenizer(dis.readLine());
        double price = Double.parseDouble(st.nextToken());

        dos.writeInt(code);
        dos.writeInt(items);
        dos.writeDouble(price);


        int cn = dis.readInt();
        int tot_itm = dis.readInt();
        double cost = dis.readDouble();

        double tot_cst = tot_itm*cost;
        dis.close();

        System.out.println("Code : "+cn);
        System.out.println("Items : "+tot_itm);
        System.out.println("Cost : "+cost);
        System.out.println("Total Cost : "+tot_cst);

    }
}
