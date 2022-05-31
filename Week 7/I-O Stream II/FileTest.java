// import java.io.File;
import java.io.*;



public class FileTest {
    public static void main(String[] args) {
        File f;

        if (args.length>0){
            for (int i=0; i<args.length; i++){
                f = new File(args[i]);
                // f = new File("abcd.txt");
                // f.is
                getPaths(f);
                getInfo(f);
            }
        }
        else System.out.println("Usage : Java file test <filename (s)");
    }


    public static void getPaths(File f){
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getPath());
        System.out.println("Parent : "+f.getParent());
    
    }

    public static void getInfo(File f){
        if (f.exists()){
        
            System.out.println("File Exsist");
            System.out.println(f.canRead() ? " and is readable ":"");
            System.out.println(f.canWrite() ? " and is Writable ":"");
            System.out.println("File is last modified at "+f.lastModified());
            System.out.println("File is "+f.length()+" bytes");
        }

    }
}
