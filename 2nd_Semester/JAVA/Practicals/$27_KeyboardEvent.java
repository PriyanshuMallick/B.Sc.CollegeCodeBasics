// 27. Write a program to demonstrate different keyboard handling events.

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class $27_KeyboardEvent implements KeyListener {

    // Frame
    static JFrame frame = new JFrame();

    // Lable
    static JLabel headingLable = new JLabel("Keyboard Operation");
    static JLabel keyPresedLabel = new JLabel("Key Pressed: ");
    static JLabel keyReleasedLabel = new JLabel("Key Released");
    static JLabel keyTypedLabel = new JLabel("Key Typed: ");

    // Methods

    // Keyboard Event Management
    @Override
    public void keyPressed(KeyEvent e) {
        keyPresedLabel.setText("Key Pressed: True");
        keyReleasedLabel.setText("Key Released: False");
        keyTypedLabel.setText("Key Typed: False");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyPresedLabel.setText("Key Pressed: False");
        keyReleasedLabel.setText("Key Released: True");
        keyTypedLabel.setText("Key Typed: False");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        keyTypedLabel.setText("Key Typed: True");
    }

    public void appDesign() {
        frame.addKeyListener(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setSize(700, 400); // window size
        frame.setLayout(new GridLayout(2, 1));

        // Add Label to Layout
        frame.add(headingLable);
        frame.add(keyPresedLabel);
        frame.add(keyReleasedLabel);
        frame.add(keyTypedLabel);
    }

    public static void main(String[] args) {

        $27_KeyboardEvent app = new $27_KeyboardEvent();

        app.appDesign();

    }
}
