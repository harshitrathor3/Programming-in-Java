public class Test implements Runnable{

    public void run() {
        System.out.println("Hiii There");
    }
    
    public static void main(String[] args) {
        Thread t = new Thread(new Test());
        t.start();
    }
}
