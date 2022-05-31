// import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBytes {
    public static void main(String[] args) throws IOException{
        byte cities[] = {'D','l','h','i','\n','M','a','d','r','s','\n','l','o','n','d','o','n','\n'};

        FileOutputStream fos = new FileOutputStream("aaa.txt");
        fos.write(cities);
        fos.close();
    }
}
