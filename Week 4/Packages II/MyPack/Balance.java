package MyPack;

public class Balance{
    String name;
    double bal;

    public Balance(String name, double bal){
        this.name = name;  this.bal = bal;
    }

    public void show(){
        if (bal<0) System.out.println("Account is dead");
        else System.out.println("Name : "+name+" Balance : "+bal);
    }
}