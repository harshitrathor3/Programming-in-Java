class Account{
    double balance;
    public int accountno;

    void display(){
        System.out.println("Account no = "+accountno+" Balance = "+balance);
    }

     synchronized void deposit(double amt){
        this.balance+=amt;
        System.out.println(amt+" is deposited");
        display();
    }

     synchronized void withdraw(double amt){
        this.balance-=amt;
        System.out.println(amt+" is withdrawed");
        display();
    }
}

class TransactionDeposit implements Runnable{
    Account accountx;
    double amt;

    TransactionDeposit(Account x, double amt){
        accountx = x;
        this.amt = amt;

        new Thread(this).start();
    }

    public void run(){
        accountx.deposit(amt);
    }
}


class TransactionWithdrawal implements Runnable{
    Account accounty;
    double amt;

    TransactionWithdrawal(Account y, double amt){
        accounty = y;
        this.amt = amt;

        new Thread(this).start();
    }
    
    public void run(){
        accounty.withdraw(amt);
    }
}


public class Transaction {
    public static void main(String[] args) {
        Account abc = new Account();
        abc.balance = 1000;
        TransactionDeposit t1;
        TransactionWithdrawal t2;

        t1 = new TransactionDeposit(abc, 500);
        t2 = new TransactionWithdrawal(abc, 900);
    }
}
