package javaapplication5;
import java.awt.Frame;
import java.awt.Checkbox;


public class CheckBox extends Frame{

//    public CheckBox() {
//        
//    } 
    public static void main(String[] args) {
        Frame f = new Frame("Frame with Check Box");
        Checkbox c1 = new Checkbox("Java");
        c1.setBounds(100, 100, 50, 50);
        Checkbox c2 = new Checkbox("C++",true);
        c2.setBounds(100, 150, 50, 50);
        f.add(c1);
        f.add(c2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
