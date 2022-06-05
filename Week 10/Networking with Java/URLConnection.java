import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
// import java.net.URLConnection;


public class URLConnection {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url  = new URL("https://nptel.ac.in/course.html");
        java.net.URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();

        int b;

        while ((b=is.read())!=-1){
            if (b=='\n')
            System.out.println((char)b);
            else System.out.print((char)b);
        }

    }
}
