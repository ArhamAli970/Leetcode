class Solution {
    // public static int call(int i,int j,int grid[][],int k){
      
    public int countSubmatrices(int[][] grid, int k) {
       int n=grid.length,m=grid[0].length;
        int cnt=0;
        int arr[][]= new int[n][m];

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[i][j];
                int above=i-1>=0?arr[i-1][j]:0;
                arr[i][j]=sum+above;
                if(arr[i][j]<=k){cnt++;}
            }
        }

        return cnt;
       
        
    }
}