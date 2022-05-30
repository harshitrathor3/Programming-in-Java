import MyPack.Balance;

class Account_Balance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];

        current[0] = new Balance("K.J. Fielding", 123.23);
        current[1] = new Balance("Will Teil", 157.02);
        current[2] = new Balance("Tom Jackson", 12.33);

        int a[] = {1, 2, 3} ;
        for (int i:a){
            current[i-1].show();
        }
    }    
}
