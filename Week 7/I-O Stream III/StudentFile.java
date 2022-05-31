import java.awt.Frame;
import java.awt.TextField;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
// import java.awt.event.*;

import java.awt.Button;
import java.awt.Event;
import java.awt.Label;
import java.awt.GridLayout;


public class StudentFile extends Frame{
    TextField number, name, marks;
    Button enter, done;
    Label numLabel, nameLabel, markLabel;
    DataOutputStream dos;

    StudentFile(){
        super("Create Student File");
    }

    void setup(){
        resize(400, 200);
        // setSize(400, 200);
        setLayout(new GridLayout(4, 2));

        number = new TextField(25);
        numLabel = new Label("Roll Number");

        name = new TextField(25);
        nameLabel = new Label("Student Name");

        marks = new TextField(25);
        markLabel = new Label("Marks");

        enter = new Button("Enter");
        done = new Button("Done");

        add(numLabel);
        add(number);
        add(nameLabel);
        add(name);
        add(markLabel);
        add(marks);
        add(enter);
        add(done);
        show();
        // setVisible(true);

        try{
             dos = new DataOutputStream(new FileOutputStream("city.txt"));

        }
        catch(Exception e){
            System.out.println(e);
        }

    }

    void addRecord(){
        int num;
        Double d;
        num = (new Integer(number.getText())).intValue();

        try{
            dos.writeInt(num);
            dos.writeUTF(name.getText());
            d = new Double(marks.getText());
            dos.writeDouble(d.doubleValue());

        }
        catch(Exception e){
            System.out.println(e);
        }
        number.setText("");
        name.setText("");
        marks.setText("");
    }

    void cleanup(){
        if (!number.getText().equals("")){
            addRecord();
        }

        try{
            dos.flush();
            dos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    public boolean action(Event event, Object o){
        if (event.target instanceof Button){
            if (event.arg.equals("ENTER")){
                addRecord();
                return true;
                
            }
        }
        return super.action(event, o);
    }

    public boolean handleEvent(Event event){
        if (event.target instanceof Button)
            if (event.arg.equals("DONE")){
                cleanup();
                System.exit(0);
                return true;
            }
            return super.handleEvent(event);
    }

    public static void main(String[] args) {
        StudentFile student = new StudentFile();
        student.setup();
    }
}
