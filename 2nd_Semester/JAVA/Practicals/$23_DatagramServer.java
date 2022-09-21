// 23. Write a program to implement a simple datagram client and server in which a message that
// is typed into the server window is sent to the client side where it is displayed.

// You could just import java.net*
// I just tried optimizing the code by not importing unnecessary classes

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.DatagramPacket;

public class $23_DatagramServer {
    public static void main(String[] args) {
        try {
            DatagramSocket dataSocket = new DatagramSocket(5555); // Setiing the server port to 5555

            // Listen loop
            while (true) {
                try {
                    byte[] data = "This is some data in bytes.".getBytes();
                    // .getBytes() method converts the string into a byte array

                    DatagramPacket dataPacket = new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 5555);
                    // DatagramPacket constructor takes 4 arguments
                    // (WHAT_DATA_YOU_WANT_TO_SEND, SIZE_OF_THE_DATA, IP_ADDRESS_OF_THE_RECEIVER,
                    // PORT_NO._OF_THE_RECEIVER)
                    // InetAddress.getLocalHost() method get the IP address of the localhost

                    dataSocket.send(dataPacket);
                    dataSocket.close();

                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            dataSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
