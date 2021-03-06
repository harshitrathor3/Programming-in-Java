import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();

        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str="", str2 = "";

        while (!str.equals("stop")){
            str = dis.readUTF();
            System.out.println("Client Saya : "+str);
            str2 = br.readLine();
            dos.writeUTF(str2);
            dos.flush();
        }
        dis.close();
        s.close();
        ss.close();
    }
}
