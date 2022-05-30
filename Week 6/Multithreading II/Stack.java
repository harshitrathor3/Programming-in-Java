public class Stack {
    private int top = 0;
    private int data[] = new int[10];

    public void push(int x){
        data[top] = x;
        top++;
    }

    public int pop(){
        top--;
        return data[top];
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        int dt[] = s.data;
        s.push(1);s.push(2);s.push(3);s.push(4);s.push(6);s.push(5);
        

        for (int i=0; i<dt.length; i++){
            System.out.println(s.data[i]);
        }
        System.out.println();   
        System.out.println(s.pop());System.out.println(s.pop());System.out.println(s.pop());System.out.println(s.pop());
        System.out.println();   
        
        System.out.println();
        for (int i=0; i<dt.length; i++){
            System.out.println(s.data[i]);
        }
        System.out.println(dt.length);
    }
}
