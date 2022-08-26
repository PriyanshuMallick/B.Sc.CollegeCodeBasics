// A program to demonstrate a simple client and server in which a message that
// is typed into the server window is sent to the client side where it is displayed.

// You could just import java.io.* and java.net*
// I just tried optimizing the code by not importing unnecessary classes

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.Socket;

public class $23_DatagramClient_0 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5432);
            InputStream sin = socket.getInputStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(sin));
            System.out.println(bReader.readLine());

            bReader.close();
            socket.close();
        } catch (ConnectException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
