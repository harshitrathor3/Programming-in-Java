package Demonstration_812;

import Demonstration_812.pack.*;

public class Savings extends Balance{
    String branch;
    int custID;
    
    Savings(String n, double b, String brnch, int id){
        super(n, b);
        branch = brnch;
        id = custID;
    }

    public void show(){
        if (bal<0) System.out.println("Sorry Negative Balance");
        System.out.println("Name : "+name+" Balance : "+bal+" custormer ID : "+custID );
    }

    public static void main(String[] args) {
        Savings current[] = new Savings[3];

        current[0] = new Savings("Amit", 456.014, "Indore", 1);
        current[1] = new Savings("Amittt", 555.014, "Indore", 2);
        current[2] = new Savings("Amityyy", 666.014, "Indore", 3);

        for (int i=0; i<3; i++)
            current[i].show();
    }
}
