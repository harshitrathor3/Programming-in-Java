class R implements Runnable{
    static int x;
    public void run(){
        
        for (int i=1; i<5; i++){
            x++;
            System.out.println("i = "+i);
        }
    }
}

public class Test1 {
    public static void main(String args[]){
        Thread t1 = new Thread(new R());
        Thread t2 = new Thread(new R());

        t1.start();
        System.out.println("x = "+R.x);
        t2.start();
        System.out.println("x = "+R.x);

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Done");
        }
        System.out.println(R.x);
    }
}
