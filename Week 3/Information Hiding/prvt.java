class P{
    //private
     int data = 40;

    public void msg(){
        System.out.println("yesss");
    }
}

public class prvt {
    public static void main(String[] args) {
        P p = new P();
        p.msg();
        System.out.println(p.data);
    }
}
