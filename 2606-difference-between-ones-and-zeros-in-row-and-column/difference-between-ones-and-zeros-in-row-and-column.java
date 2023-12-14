class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

       int n=grid.length;
       int m=grid[0].length;

       int[] rowSum=new int[n];
       int[] colSum=new int[m];

       for(int i=0;i<n;i++){ 
           int sum=0;
           for(int j=0;j<m;j++){ 
              sum+=grid[i][j];
           }
           rowSum[i]=sum;
       }

        for(int j=0;j<m;j++){ 
           int sum=0;
           for(int i=0;i<n;i++){ 
              sum+=grid[i][j];
           }
           colSum[j]=sum;
       }

       int ans[][]=new int[n][m];

       for(int i=0;i<n;i++){ 
           for(int j=0;j<m;j++){ 
               ans[i][j]=rowSum[i]+colSum[j]-(n-rowSum[i])-(m-colSum[j]);
           }
       }

return ans;

    }
}