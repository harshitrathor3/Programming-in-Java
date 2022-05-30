class A extends Thread{
    public void run(){
        System.out.println(".......Thread A starting");
        for (int i=1; i<5; i++)
            System.out.println("\tFrom Thread a i = "+i);
        System.out.println("Thread A Ended........");
    }
}

class B implements Runnable{
    public void run(){
        System.out.println(".....Thread B started");

        for (int j=1; j<5; j++)
            System.out.println("\t From Thread B j = "+j);
        System.out.println("Thread B Endned........");
    }
}

class C extends Thread{
    public void run(){
        System.out.println(".......Thread C starting");
        for (int k=1; k<5; k++)
            System.out.println("\tFrom Thread C k = "+k);
        System.out.println("Thread C Ended........");
    }
}


public class ThreadPriority{
    public static void main(String[] args) {
        A a = new A();
        Thread b = new Thread(new B());
        C c = new C();

        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(a.getPriority()+1);
        a.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread A started");
        a.start();
        
        System.out.println("Thread B started");
        b.start();

        System.out.println("Thread C started");
        c.start();

    }
}