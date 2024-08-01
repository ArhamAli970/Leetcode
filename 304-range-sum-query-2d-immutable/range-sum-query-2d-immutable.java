class NumMatrix {

static int arr[][];
    public static int getRow(int i,int[][] mat,int j){
        int sum=0;
        for(int k=0;k<j;k++){
            sum+=mat[i][k];
        }
        return sum;
    }

     public static int getCol(int i,int[][] mat,int j){
        int sum=0;
        for(int k=0;k<i;k++){
            sum+=mat[k][j];
        }
        return sum;
    }


    public NumMatrix(int[][] matrix) {
        int sum=0, n=matrix.length,m=matrix[0].length;
        arr=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                int s1= getRow(i,matrix,j);
                int s2= getCol(i,matrix,j);
                int s3=i-1>=0 && j-1>=0?arr[i-1][j-1]:0;

                arr[i][j]=s1+s2+s3+matrix[i][j];
              
            }
        }



    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int ts=arr[row2][col2]; // get total sum at final point

        // rowLast2nd point
        ts-=col1-1>=0?arr[row2][col1-1]:0;
        ts-=row1-1>=0?arr[row1-1][col2]:0;
        ts+=row1-1>=0 && col1-1>=0?arr[row1-1][col1-1]:0;

        return ts;



        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */