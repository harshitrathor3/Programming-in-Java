public class Question23 {
    public static void main(String args[]){

        Question23 q = new Question23();
        q.studentMethod();
    }

    void print(Question23 object){
        System.out.print("Well Done");
    }

    void studentMethod(){
        Question23 q1 = new Question23();
        q1.print(q1);
    }
}
