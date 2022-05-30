class Printer{
    public void print(){
        System.out.println("Hi! I class SCHOOL");
    }

    public void print(String s){
        System.out.println(s);
    }
}


public class Question22 {
    public static void main(String args[]){
        Printer p = new Printer();

        p.print("Hi! I am class STUDENT");
        p.print();
    }
}