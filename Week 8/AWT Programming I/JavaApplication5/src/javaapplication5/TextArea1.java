package javaapplication5;
import java.awt.Frame;
import java.awt.TextArea;

public class TextArea1 {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with Text Area");
        TextArea ta = new TextArea("Welcome to IIT Karagpur");
        ta.setBounds(10, 30, 300, 300);
        f.add(ta);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(400, 400);
    }
}
