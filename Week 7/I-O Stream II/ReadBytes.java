import java.io.FileInputStream;
import java.io.IOException;

public class ReadBytes {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream(args[0]);
        int b=0;

        while((b=fis.read())!=-1)
            System.out.println((char)b);
        
        fis.close();


    }
}
