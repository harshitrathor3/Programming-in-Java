import java.util.Scanner;
class QuestionScope {
int sum(int a, int b){ //non-static method
        return a + b;
    }
static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class Excercise3_4{
public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
        QuestionScope qs = new QuestionScope();
        System.out.println(qs.sum(n1, n2));
        System.out.println(QuestionScope.multiply(n1, n2));
    }

}