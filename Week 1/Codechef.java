import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
class Codechef{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int t;
        t = s.nextInt();
        
        while(t--!=0){
            String s1 = s.nextLine();
            String s2 = s.nextLine();
            String arr="";
            int ans;
            for (int i=0; i<s2.length(); i++){
                ans=1;
                for (int j=0; j<s1.length(); j++){
                    if (s2.charAt(i)==s1.charAt(j)){
                        ans=0;
                        break;
                    }


                    if (ans==1){
                        int ans1 = 1;
                        char temp[] = arr.toCharArray();

                        for (int i1=0; i1<temp.length; i1++){
                            if (s2.charAt(i)==temp[i]) ans1=0;

                        }
                        if (ans1==1)
                        arr+=s2.charAt(i);
                    }
                }
            }
            if (arr.length()==0) System.out.println(-1);
            else{
                char temp[] = arr.toCharArray();
                Arrays.sort(temp);
                for (int i=0; i<temp.length; i++){
                    System.out.print(temp[i]);
                }
                System.out.println();
            }

        }
    }
}