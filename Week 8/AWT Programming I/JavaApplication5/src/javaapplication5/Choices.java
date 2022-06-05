package javaapplication5;
import java.awt.Frame;
import java.awt.Choice;

public class Choices {
    public static void main(String[] args) {
        Frame f = new Frame("Frame with List");
        Choice c = new Choice();
        c.setBounds(100, 100, 75, 75);
        c.add("Item 1");
        c.add("Item 2");
        c.add("Item 3");
        f.add(c);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
