public class Question {
    public static int x = 7;

    public static void main(String[] args) {
        Question a = new Question();
        Question b = new Question();

        a.x = 2;
        b.x = 3;

        System.out.println(a.x+b.x+++Question.x);
    }
}