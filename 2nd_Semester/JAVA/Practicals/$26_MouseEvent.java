// 26. Write a program to demonstrate different mouse handling events like
// mouseClicked(), mouseEntered(), mouseExited(), mousePressed, mouseReleased()
// and mouseDragged().

import java.awt.GridLayout;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.MouseInputAdapter;

public class $26_MouseEvent {

    public static void main(String[] args) {

        // Frame
        JFrame frame = new JFrame("Mouse Handling Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Lable
        JLabel headingLable = new JLabel("👇🏽Mouse Operation👇🏽");
        headingLable.setHorizontalAlignment(JLabel.CENTER);
        JLabel mouseEventLabel = new JLabel("");
        mouseEventLabel.setHorizontalAlignment(JLabel.CENTER);

        // Mouse Event Management
        frame.addMouseListener(new MouseInputAdapter() {
            public void mouseClicked(MouseEvent e) {
                mouseEventLabel.setText("Mouse Clicked");
            }

            public void mouseEntered(MouseEvent e) {
                mouseEventLabel.setText("Mouse Entered");
            }

            public void mouseExited(MouseEvent e) {
                mouseEventLabel.setText("Mouse Exited");
            }

            public void mousePressed(MouseEvent e) {
                mouseEventLabel.setText("Mouse Pressed");
            }

            public void mouseReleased(MouseEvent e) {
                mouseEventLabel.setText("Mouse Released");
            }
        });

        // App Layout
        frame.setSize(700, 400); // window size
        frame.setLayout(new GridLayout(2, 1));

        // Add Label to Layout
        frame.add(headingLable);
        frame.add(mouseEventLabel);
    };
}
