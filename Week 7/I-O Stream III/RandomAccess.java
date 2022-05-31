import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    static public void main(String[] args) throws IOException{
        RandomAccessFile file = new RandomAccessFile("city.txt","rw");

        file.seek(file.length());
        // byte cty = (byte)"Mumbai\n";
        file.writeBytes("Mumbai\n");
        file.close();

    }
}
