import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds = new DatagramSocket(1234);
        byte[] receive = new byte[65535];

        DatagramPacket dp = null;

        while(true){
            dp = new DatagramPacket(receive, receive.length);
            ds.receive(dp);

            System.out.println("client : "+data(receive));

            if (data(receive).toString().equals("bye")){
                System.out.println("Client sent bye......Exiting");
                break;
            }

            receive = new byte[65535];


        }
    }

    static StringBuilder data(byte[] a){

        if (a==null) return null;
        
        StringBuilder ret = new StringBuilder();
        int i=0;

        while(a[i]!=0){
            ret.append((char)a[i++]);
        }
        return ret;

    }

}
