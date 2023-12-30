class Solution {
    static int dp[][];

    public static int get(int i,int j,char matrix[][]){ 
        if(i>=0 && j>=0){ 
            return dp[i][j];
        }
        return 0;
    }




    public int maximalSquare(char[][] matrix) {
        int n=matrix.length,m= matrix[0].length;

        dp= new int[n][m];

        int max=0;


        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='1'){

                int diagonal=get(i-1,j-1,matrix);
                int up= get(i-1,j,matrix);
                int left= get(i,j-1,matrix);

                int min=Math.min(diagonal,Math.min(up,left));
                dp[i][j]=++min;

                max=Math.max(min*min,max);

                }


            }
        }


return max;


    }
}