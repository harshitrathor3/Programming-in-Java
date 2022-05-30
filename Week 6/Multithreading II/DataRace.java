public class DataRace extends Thread{
    static int x;
    public void run(){
        for (int i=0; i<100000; i++){
            x+=1;
            x-=1;
            // System.out.println("x = "+x);
        }
    }

    public static void main(String[] args) {
    x = 0;
        for (int i=0; i<100000; i++){
            DataRace dr = new DataRace();
            dr.start();
        }
        System.out.println(x);

    }
}
