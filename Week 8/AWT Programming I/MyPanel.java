import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class MyPanel {
    public static void main(String[] args) {
    Frame f = new Frame("Frame with Panel");
    Panel p = new Panel();
    f.resize(200, 200);
    f.setBackground(Color.GREEN);
    f.setLayout(null);
    p.resize(100, 100);
    p.setBackground(Color.GRAY);
    f.add(p);
    f.show();
    }
}
