public class BankDemo {
    public static void main(String[] args) {
        CheckAccount c = new CheckAccount(101);
        System.out.println("Deposit $500");
        c.deposit(500);

        try{
            System.out.println("Withdrawing 100");
            c.withdraw(100);
            System.out.println("Withdrawing 600");
            c.withdraw(600);
        }
        catch (InsuffisientFundsException e){
            System.out.println("Sorry but you are short "+e.getAmount());
            System.out.println();
            e.printStackTrace();
        }

    }
}
