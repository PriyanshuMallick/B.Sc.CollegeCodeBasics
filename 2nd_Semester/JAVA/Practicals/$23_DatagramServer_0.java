// A program to demonstrate a simple client and server in which a message that
// is typed into the server window is sent to the client side where it is displayed.

// You could just import java.io.* and java.net*
// I just tried optimizing the code by not importing unnecessary classes

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class $23_DatagramServer_0 {
    public static void main(String[] args) {

        try {
            // Registering server at port 5432
            ServerSocket serverSoc = new ServerSocket(5432);
            System.out.println("Starting Server");

            // Listen loop
            while (true) {
                try {
                    Socket socket = serverSoc.accept(); // Establishes Connection
                    OutputStream sOut = socket.getOutputStream();
                    BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(sOut));
                    bWriter.write("Connection established with server\n");

                    bWriter.close();
                    socket.close();

                } catch (IOException e) {
                    e.printStackTrace();
                    break;
                }
            }
            serverSoc.close();
            System.out.println("Server Closed");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
