class Solution {
    public int countSubmatrices(int[][] grid, int k) {
int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
            
                int dig=i-1>=0 && j-1>=0?grid[i-1][j-1]:0;
                int up=i-1>=0?grid[i-1][j]:0;
                int lft=j-1>=0?grid[i][j-1]:0;

                int sum=up+lft-dig+grid[i][j];
                grid[i][j]=sum;
                if(sum<=k){cnt++;}

            }
        }
        
        return cnt;
    }
}