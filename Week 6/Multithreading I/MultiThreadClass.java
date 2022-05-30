class ThreadA extends Thread{
    public void run(){

        for (int i=1; i<5; i++)
            System.out.println("From Thred A i = "+-1*i);
        
        System.out.println("Exiting from Thread A");
        
    }

}

class ThreadB extends Thread{
    public void run(){

        for (int j=1; j<5; j++)
            System.out.println("From Thread B j = "+j*2);
        
        System.out.println("Exiting from Thread B");
    }
}

class ThreadC extends Thread{
    public void run(){

        for (int k=1; k<5; k++)
            System.out.println("From Thread C k = "+ (2*k-1));
        
        System.out.println("Exiting from Thread C");
    }
}

class MultiThreadClass{
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();

        // a.start();
        a.run();
        b.start();
        c.start();
        

        System.out.println("........Multi Threading is Over");
    }
}