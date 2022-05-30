public class CheckAccount {
    private double balance;
    private int number;

    public CheckAccount(int number){
        this.number = number;
    }

    public void deposit(double amt){
        balance+=amt;
    }

    public void withdraw(double amt) throws InsuffisientFundsException{
        if (amt<=balance){
            balance-=amt;
        }

        else{
            double needs = amt-balance;
            throw new InsuffisientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public double getNumber(){
        return number;
    }
}
