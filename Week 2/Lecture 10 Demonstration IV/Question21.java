class School{
    public void print(){
        System.out.println("Hi I class School");
    }
}

class Student{
    public void print(){
        System.out.println("Hi! I am class STUDENT");
    }
}


public class Question21 {
    public static void main(String args[]){
        Student std = new Student();
        std.print();
        
        School schl = new School();
        schl.print();
    }
}
