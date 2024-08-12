class Solution {
    static int n,m;

    public static void dfs(int i,int j,int chk[][]){
        if(i<0 || j<0 || i>=n || j>=m || chk[i][j]==0){return;}
        chk[i][j]=0;
        dfs(i-1,j,chk);dfs(i+1,j,chk);dfs(i,j-1,chk);dfs(i,j+1,chk);
    }

    public static int checkConnect(int grid[][]){
        int chk[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                chk[i][j]=grid[i][j];
            }
        }

int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(chk[i][j]==1){
                    dfs(i,j,chk);
                    cnt++;
                }
            }
        }

        return cnt;

    }


    public static int testMore(int grid[][]){
        if(checkConnect(grid)==1){
            return 1;
        }

        return 0;
    }

    public int minDays(int[][] grid) {
        n=grid.length;m=grid[0].length;

        if(checkConnect(grid)!=1){return 0;}

        int min=3;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    min=Math.min(min,testMore(grid)+1);
                    grid[i][j]=1;
                }
            }
        }

        return min;


        
    }
}