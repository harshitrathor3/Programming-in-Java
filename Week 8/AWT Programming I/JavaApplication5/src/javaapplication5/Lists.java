package javaapplication5;
import java.awt.Frame;
import java.awt.List;

public class Lists {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with List");
        List l = new List(5);
        l.setBounds(100, 100, 75, 75);
        l.add("Item 1");
        l.add("Item 2");
        l.add("Item 3");
        f.add(l);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
