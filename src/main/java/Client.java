import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

            Socket clientSocket = new Socket("localhost", 4004);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

            String w = in.readLine();
            System.out.println(w);
            w = "222";
            out.write(w+"\n");
            out.flush();
        }
    }

