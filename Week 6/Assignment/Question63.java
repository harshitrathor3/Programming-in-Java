// Interface A is defined with an abstract method run()
interface A {
	public abstract void run();
}

// Class B is defined which implements A and an empty implementation of run()
class B implements A {
	public void run() {}
}

class MyThread extends B{
    public void run(){
        System.out.print("NPTEL Java week-6 new Assignment Q3");
    }
}

class MyThread1 implements A{
     public void run(){
        System.out.println("NPTEL JAVA");
    }
}


public class Question63 {
    public static void main(String[] args) {
        // An object of MyThread class is created
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();

        MyThread1 t1 = new MyThread1();
        t1.run();
    }
}