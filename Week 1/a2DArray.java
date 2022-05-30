class a2DArray {
    public static void main(String args[]){
        int myarr[][]=new int [3][3];

        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                myarr[i][j]=i*j;
        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                System.out.print(myarr[i][j]+" ");
            System.out.println();
        }

    }
}