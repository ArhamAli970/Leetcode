class Solution {
    static int n,m;
    public int islandPerimeter(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        int peri=0;
        for(int  i=0;i<n;i++){
            for(int j=0;j<m;j++){
                   if(grid[i][j]==1){
                       if(i-1<0 || grid[i-1][j]==0){peri++;}
                       if(j-1<0 || grid[i][j-1]==0){peri++;}
                       if(i+1>=n || grid[i+1][j]==0){peri++;}
                       if(j+1>=m || grid[i][j+1]==0){peri++;}
                   }
            }
        }

        return peri;
        
    }
}