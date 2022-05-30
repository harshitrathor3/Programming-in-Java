public class Demonstration_517 {
    
    static void myMythod(int counter){
        if (counter==0) return;

        System.out.println("Hello "+ counter);
        myMythod(--counter);
        System.out.println(counter);
        return;
    }

    public static void main(String args[]){
        myMythod(10);
    }
}
