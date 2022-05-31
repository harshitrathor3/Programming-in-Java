import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException{
        
        FileInputStream fis = new FileInputStream("aaa.txt");
        FileOutputStream fos = new FileOutputStream("abcd.txt");

        byte byte_read;
        do{
            byte_read = (byte) fis.read();
            fos.write(byte_read);
        }while(byte_read!=-1);
        fis.close();
        fos.close();    
    }
}
