class Solution {

public static int getMax(int x,int y,int grid[][]){
    int max=0;
      for(int i=x;i<x+3;i++){
        for(int j=y;j<y+3;j++){
            max=Math.max(grid[i][j],max);
        }
      }

      return max;
}

    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];

        int x1=0;

        for(int i=2;i<n;i++){
            int y1=0;
            for(int j=2;j<n;j++){
                      
                ans[x1][y1++]=getMax(i-2,j-2,grid);


                      

            }

            x1++;
        }
        return ans;
    }
}