class Solution {

public static boolean dfs(int i,int j,int grid[][]){ 
    if(i==grid.length || j==grid[0].length || i<0 || j<0 ){ 
        return false;
    }
    if(grid[i][j]==1){return true;}

grid[i][j]=1;


boolean up=dfs(i-1,j,grid);
boolean down=dfs(i+1,j,grid);
boolean right=dfs(i,j+1,grid);
boolean left=dfs(i,j-1,grid);


return up && down && right && left;


}

    public int closedIsland(int[][] grid) {

int cnt=0;
int n=grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){ 

                 
                 if(grid[i][j]==0 ){ 
                   
                        if(dfs(i,j,grid)){ 
                          
                            cnt++;
                        }
                 }
                

            }
        }


        return cnt;

    }
}