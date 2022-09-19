import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(4004);
        Socket clientSocket = server.accept();
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
            String w = "qwe";
            out.write(w+"\n");
            out.flush();
            w = in.readLine();
            System.out.println(w);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
