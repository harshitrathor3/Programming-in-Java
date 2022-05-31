import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitive {
    public static void main(String[] args) throws IOException{
        File f = new File("abcd.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);


        dos.writeInt(1023);
        dos.writeDouble(45.11122);
        dos.writeBoolean(true);
        dos.writeChar('a');

        dos.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        System.out.println(dis.readInt());
        System.out.println(dis.readDouble());
        System.out.println(dis.readBoolean());
        System.out.println(dis.readChar());
        System.out.println();


    }
}
