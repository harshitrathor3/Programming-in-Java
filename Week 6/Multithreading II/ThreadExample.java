public class ThreadExample extends Thread{
    public void run(){

        for (int i=1; i<3; i++){
            try{
                int j = (int)(Math.random()*5000);
                sleep(j);       //5 sec
                System.out.println("sec "+j);
            }
            catch(InterruptedException e){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        t1.start();

        ThreadExample t2 = new ThreadExample();
        t2.start();

        System.out.println("Done");
    }
}
