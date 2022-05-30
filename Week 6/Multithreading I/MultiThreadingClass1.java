import java.util.Scanner;

class ThreadA1 extends Thread{
    public synchronized void run(){

        MultiThreadClass1.s.reset();
        int i = MultiThreadClass1.s.nextInt();

        for (; i<5; i++)
            System.out.println("From Thred A i = "+-1*i);
        
        System.out.println("Exiting from Thread A");
        
    }

}

class ThreadB1 extends Thread{
    public void run(){

        // int j = MultiThreadClass1.s.nextInt();
        int  j =1;
        for (; j<5; j++)
            System.out.println("From Thread B j = "+j*2);
        
        System.out.println("Exiting from Thread B");
    }
}

class ThreadC1 extends Thread{
    public synchronized void run(){
        // Scanner scan = new Scanner(System.in);

        // int k = scan.nextInt();
        int k = MultiThreadClass1.s.nextInt();

        for ( ; k<5; k++)
            System.out.println("From Thread C k = "+ (2*k-1));
        
        System.out.println("Exiting from Thread C");
    }
}




class MultiThreadClass1{

    public static Scanner s = new Scanner(System.in);


    public static void main( final String[] args) {
        ThreadA1 a = new ThreadA1();
        ThreadB1 b = new ThreadB1();
        ThreadC1 c = new ThreadC1();

        a.start();
        b.start();
        c.start();

        System.out.println("........Multi Threading is Over");
    }
}