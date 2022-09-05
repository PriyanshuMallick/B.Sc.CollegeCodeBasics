// 29. Write a program to generate a window without an applet window using main() function.

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class $29_WindowGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel text = new JLabel("Hello World!");

        frame.add(text);
    }
}
