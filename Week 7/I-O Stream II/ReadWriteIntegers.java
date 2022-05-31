import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteIntegers {
    public static void main(String[] args) throws IOException{
        
        File f = new File("AAA.txt");

        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);

        for (int i=0; i<20; i++)
            dos.writeInt((int)(Math.random()*100));
            
        dos.close();
        fos.close();

        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        

        for (int i=0; i<20; i++)
            System.out.println(dis.readInt()+" ");

        dis.close();
        fis.close();
    }
}
