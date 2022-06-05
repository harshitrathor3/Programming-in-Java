package javaapplication5;
import java.applet.Applet;
import java.awt.Button;

public class ButtonTest extends Applet{
    public void init(){
        Button b1, b2;
            b1 = new Button("Welcome");
            b2 = new Button();
            add(b1);
            add(b2);
            
    }
}
