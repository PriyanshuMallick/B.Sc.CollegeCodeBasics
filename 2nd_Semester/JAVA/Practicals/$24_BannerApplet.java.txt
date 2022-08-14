// 24. Write a program that creates a Banner and then creates a thread to scrolls the message in the
// banner from left to right across the applet‘s window.

import java.applet.Applet;
import java.awt.Graphics;

public class $24_BannerApplet extends Applet implements Runnable {
    String message = "Aloha!";
    Boolean runFlag = true;
    char ch;
    Thread t;

    @Override
    public void start() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (runFlag) {
            try {
                repaint();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void stop() {
        t.stop();
    }

    @Override
    public void print(Graphics g) {
        g.drawString(message, 60, 30);
    }
}
