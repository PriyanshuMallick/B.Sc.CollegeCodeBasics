// 23. Write a program to implement a simple datagram client and server in which a message that
// is typed into the server window is sent to the client side where it is displayed.

// You could just import java.net*
// I just tried optimizing the code by not importing unnecessary classes

import java.net.DatagramSocket;
// import java.net.InetAddress;
import java.net.DatagramPacket;

public class $23_DatagramClient {
    public static void main(String[] args) {
        try {
            DatagramSocket dataSocket = new DatagramSocket();
            byte[] data = new byte[5000]; // A byte array to store the incomming data from the server side

            DatagramPacket packet = new DatagramPacket(data, data.length);

            dataSocket.receive(packet);

            String msg = new String(data);
            System.out.println("Message from client: " + msg);
            dataSocket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
