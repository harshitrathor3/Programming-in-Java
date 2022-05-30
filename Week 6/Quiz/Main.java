public class Main {
    public static void main(String[] args) {
            Thread thread = Thread.currentThread();
            System.out.println(thread.activeCount());
            thread.run();
            System.out.println(thread.activeCount());

    }
}
