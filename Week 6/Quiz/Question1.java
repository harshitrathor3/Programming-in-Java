public class Question1 extends Thread{

    public void run(){
        for (int i=1; i<5; i++){
            System.out.println(++i);
        }
    }
    public static void main(String[] args) {
        Question1 t1 = new Question1();
        t1.run();
    }
}
