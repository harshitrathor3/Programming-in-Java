import java.awt.Color;
import java.awt.Frame;

class MyFrame{
    public static void main(String[] args) {
        Frame f = new Frame("Frame in Java");
        f.resize(500, 500);
        f.setBackground(Color.BLUE);
        f.show();
    }
}