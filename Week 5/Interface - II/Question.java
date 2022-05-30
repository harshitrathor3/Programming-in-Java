import java.util.Random;

public class Question implements SharedConstants{
    Random rand = new Random();

    int ask(){
        int prob = (int)(100*rand.nextDouble());

        if (prob<30)
            return No;
        else if (prob<60)
            return yes;
        else if (prob<75)
            return later;
        else if (prob<90)
            return soon;
        else
            return never;
    }

    public static void main(String[] args) {
        Question q = new Question();
        System.out.println(q.ask());
    }
}
