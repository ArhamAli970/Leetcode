class Solution {
    
    public int countServers(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int row[]=new int[n];
        int col[]=new int[m];
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<m;j++){
                cnt+=grid[i][j];
            }
            row[i]=cnt;    
        }

        for(int i=0;i<m;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                cnt+=grid[j][i];
            }
            col[i]=cnt;    
        }

int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                     if(row[i]-1>0 || col[j]-1>0){cnt++;}
                }
            }
        }


        return cnt;

    }
}