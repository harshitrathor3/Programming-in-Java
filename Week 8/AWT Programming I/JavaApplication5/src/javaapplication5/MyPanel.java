package javaapplication5;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyPanel {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with Panel");
        Panel p = new Panel();
        f.setSize(200, 200);
        f.setBackground(Color.cyan);
//        f.setLayout(null);
        p.setSize(100, 100);
        p.setBackground(Color.GREEN);
        f.add(p);
        f.setVisible(true);
    }
}
