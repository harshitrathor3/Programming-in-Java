public class InsuffisientFundsException extends Exception{
    private double amt;
    public InsuffisientFundsException(double amt){
        this.amt = amt;
    }

    public double getAmount(){
        return amt;
    }
}
