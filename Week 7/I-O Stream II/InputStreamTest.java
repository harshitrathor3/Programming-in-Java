import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
    public static void main(String[] args) throws IOException {
        int size;

        FileInputStream fin = new FileInputStream("abcd.txt");
        size = fin.available();
        System.out.println("Total bytes :"+size);
        System.out.println("First 1/4 is displayed using read()");

        for (int i=0; i<size/4; i++){
            System.out.print((char)fin.read());
        }
        System.out.println();
        System.out.println("Remaing Bytes : "+fin.available());
        System.out.println("Next 1/4 is displayed using read()");

        byte b[] = new byte[size/4];

        if (fin.read(b)!=b.length)
            System.err.println("File reading error");
        
        else{
            String temp = new String(b, 0, 0, b.length);
            System.out.println(temp);
            System.out.println("Still available "+fin.available());
            System.out.println("Skipping using skip()");
            fin.skip(size/4);
            System.out.println("File remaing for read : "+fin.available());
        }
        fin.close();
    }
}
