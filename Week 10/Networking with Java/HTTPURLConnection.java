import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.URL;

class HTTPURLConnection{
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://nptel.ac.in/course.html");
        HttpURLConnection huc = (HttpURLConnection)url.openConnection();

        for (int i=0; i<=8; i++){
            System.out.println(huc.getHeaderFieldKey(i)+" "+huc.getHeaderField(i)+"\n");
        }

        huc.disconnect();

    }
}