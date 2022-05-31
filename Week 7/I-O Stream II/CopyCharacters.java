import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters {
    public static void main(String[] args) throws IOException{
        File in = new File("aaa.txt");
        File out = new File("abcd.txt");
        FileReader fr = new FileReader(in);
        FileWriter fw = new FileWriter(out);
        
        int ch;

        while ((ch=fr.read())!=-1)
            fw.write(ch);
        
        fr.close();
        fw.close();
    }
}
