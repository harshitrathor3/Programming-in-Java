public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.println(Thread.currentThread().getName()+" has ended.");  
        // Thread.currentThread().
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Java Week 6 New Question.");
        Thread t1 = new Thread(new Question62());
        // Main.start();
        t1.setName("Main Thread");
        t1.start();
        // t1.run();
    }
}