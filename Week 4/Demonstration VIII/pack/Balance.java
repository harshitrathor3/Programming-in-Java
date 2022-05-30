package pack;

public class Balance {
    public String name;
    public double bal;

    public Balance(String n, double b){
        name = n;  bal = b;
    }

    protected void show(){
        if (bal<0)
            System.out.println("Sorry negative balance");
        System.out.println(bal);
    }
}
