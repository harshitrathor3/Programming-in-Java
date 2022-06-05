import java.net.URL;

class URLClass{
    public static void main(String[] args) throws Exception{
        URL url = new URL("https://nptel.ac.in/course.html");
        System.out.println("Protocol : "+url.getProtocol());
        System.out.println("Host Name : "+url.getHost());
        System.out.println("Port no : "+url.getPort());
        System.out.println("File Name : "+url.getFile());

    }
}