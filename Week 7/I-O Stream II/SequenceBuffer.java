import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceBuffer {
    public static void main(String[] args) throws IOException{
        FileInputStream f1 = new FileInputStream("abcd.txt");
        FileInputStream f2 = new FileInputStream("aaa.txt");
        SequenceInputStream f3 = new SequenceInputStream(f1, f2);

        BufferedInputStream bis = new BufferedInputStream(f3);
        BufferedOutputStream bos = new BufferedOutputStream(System.out);

        System.out.println();
        
        int ch;
        while ((ch=bis.read())!=-1)
            bos.write(ch);

        bos.close();
        bis.close();
        f1.close();
        f2.close();
        

    }
}
