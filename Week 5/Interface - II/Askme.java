public class Askme implements SharedConstants{
    static void answer(int result){
        switch (result){
            case No: System.out.println("No");
                    break;
            case yes: System.out.println("Yes");
                    break;
            case maybe: System.out.println("May Be");
                    break;
            case later : System.out.println("Later");
                    break;
            case soon: System.out.println("Soon");
                    break;
            case never: System.out.println("Never");
                    break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}
