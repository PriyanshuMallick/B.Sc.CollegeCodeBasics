// 23. Write a program to implement a simple datagram client and server in which a message that
// is typed into the server window is sent to the client side where it is displayed.

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class $23_DatagramServer {
    public static void main(String[] args) {
        // ServerSocket serverSoc = null;

        try {
            // Server registred at port 0000
            ServerSocket serverSoc = new ServerSocket(5432);
            System.out.println("Starting Server");

            // Listen loop
            while (true) {
                try {
                    Socket socket = serverSoc.accept();
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
