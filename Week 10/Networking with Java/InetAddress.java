// import java.net.InetAddress;
import java.io.*;
import java.net.*;

public class InetAddress {
    public static void main(String[] args) throws Exception{
        InetAddress ip = InetAddress.getByName("www.nptel.ac.in");
        System.out.println("Host Name : "+ip.getHostName());
        System.out.println("IP Address : "+ip.getHostAddress());
        

    }

      
}
