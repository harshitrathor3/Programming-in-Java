import java.util.ArrayList;
import java.util.Scanner;

class SimpleArrayList {
    public static void main(String args[]){
        int sum=0;
        float avg=0;
        ArrayList <Integer> l = new ArrayList<Integer>();

        System.out.println("Enter the input");

        Scanner input = new Scanner(System.in);
        
        while (input.hasNextInt()){
            l.add(input.nextInt());
        }

        for (int i=0; i<l.size(); i++){
            sum = sum + l.get(i);
        }
        avg = sum/l.size();
        System.out.println("Average : "+avg);

        input.close();
    }
}
