class BaseClass{
    public int x = 10;
    private int y = 20;
    protected int z = 30;
    int a = 100;

    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }


    private void setY(int y){
        this.y = y;
    }

    private int getY(){
        return y;
    }


    protected void setZ(int z){
        this.z = z;
    }

    protected int getZ(){
        return z;
    }


    void setA(int a){
        this.a = a;
    }

    int getA(){
        return a;
    }
}

class Demonstration_715 extends BaseClass{
    public static void main(String[] args) {
        BaseClass rr = new BaseClass();
        // rr.z = 0;
        System.out.println(rr.a+" "+rr.x+" "+rr.z);

        Demonstration_715 d = new Demonstration_715();
        
        d.setA(15);
        System.out.println(d.getA());
        
        d.setX(150);
        System.out.println(d.getX());

        // d.setY(15);
        // System.out.println(d.getY());

        d.setZ(1500);
        System.out.println(d.getZ());
    }
}