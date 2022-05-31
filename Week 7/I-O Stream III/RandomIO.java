import java.io.IOException;
import java.io.RandomAccessFile;

class RandomIO{
    public static void main(String[] args) throws IOException{
        RandomAccessFile file = new RandomAccessFile("rand.dat", "rw");
        file.writeChar('X');
        file.writeInt(555);
        file.writeDouble(132.454);

        file.seek(0);

        System.out.println(file.readChar());
        System.out.println(file.readInt());
        System.out.println(file.readDouble());

        file.seek(0);  //go to second item
        System.out.println(file.readChar());


        file.seek(file.length());
        file.writeBoolean(false);
        file.seek(3);
        System.out.println(file.readBoolean());
        file.close();

    }
}