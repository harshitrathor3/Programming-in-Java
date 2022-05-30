class Ab{
    protected int a =5;

    protected void msg(){
        System.out.println("heloo yeuu");
    }
}

class notInherit {


    // void msg(){
    //     System.out.println("ehfsnfkenf");

    // }
    public static void main(String[] args) {
        prac p = new prac();
        System.out.println(p.data);
        Ab a = new Ab();
        System.out.println(a.a);
        a.msg();
        
    }
}
