import java.util.Scanner;

public class Question93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[][] = new int[5][5];
        char arrOutput[][] = new char[5][5];
        String ar[] = new String[5] ;



        for (int i=0; i<5; i++){
            ar[i] = sc.nextLine();
        }

        char arr[][] = new char[5][5];

        for (int i=0; i<5; i++)
            for (int j=0; j<5; j++)
                arr[i][j] = ar[i].charAt(j);



        // for (int i=0; i<5; i++)
        //     for (int j=0; j<5; j++)
        //         arr[i][j] = inp.nextInt();

        arrOutput[0][2] = arr[0][0];
        arrOutput[0][3] = arr[0][1];
        arrOutput[0][4] = arr[0][2];
        arrOutput[1][4] = arr[0][3];
        arrOutput[2][4] = arr[0][4];
        
        
        arrOutput[0][1] = arr[1][0];
        arrOutput[1][2] = arr[1][1];
        arrOutput[1][3] = arr[1][2];
        arrOutput[2][3] = arr[1][3];
        arrOutput[3][4] = arr[1][4];
        
        
        arrOutput[0][0] = arr[2][0];
        arrOutput[1][1] = arr[2][1];
        arrOutput[2][2] = arr[2][2];
        arrOutput[3][3] = arr[2][3];
        arrOutput[4][4] = arr[2][4];
        
        
        arrOutput[1][0] = arr[3][0];
        arrOutput[2][1] = arr[3][1];
        arrOutput[3][1] = arr[3][2];
        arrOutput[3][2] = arr[3][3];
        arrOutput[4][3] = arr[3][4];
        
        
        arrOutput[2][0] = arr[4][0];
        arrOutput[3][0] = arr[4][1];
        arrOutput[4][0] = arr[4][2];
        arrOutput[4][1] = arr[4][3];
        arrOutput[4][2] = arr[4][4];

            for (int i=0; i<5; i++){
                for (int j=0; j<5; j++)
                    System.out.print(arrOutput[i][j]+" ");
                System.out.println();
            }

    }
}
