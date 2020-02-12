import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class HTTP_Server {
    public static void main(String[] args) throws IOException {
        final ServerSocket serverSocket = new ServerSocket(8080); //port
        System.out.println("listening on port ..." + serverSocket.getLocalPort());
        while (true){
            final Socket clientsocket = serverSocket.accept();
            InputStreamReader inputStreamReader = new InputStreamReader(clientsocket.getInputStream());
            BufferedReader reader =new BufferedReader(inputStreamReader);
            String line =reader.readLine();
            while (line.isEmpty() == false){
                System.out.println(line);
                line = reader.readLine();
            }

        }
    }
}
