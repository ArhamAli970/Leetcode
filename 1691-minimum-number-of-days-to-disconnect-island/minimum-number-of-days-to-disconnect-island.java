class Solution {

    public static int comp(int i,int j,int grid[][],boolean vis[][]){
        if(i<0 || j<0 || i>=vis.length || j>=vis[0].length || vis[i][j] || grid[i][j]==0){return 0;}
        int grd[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int cnt=1;
        vis[i][j]=true;
        for(int k=0;k<4;k++){
            cnt+=comp(i+grd[k][0],j+grd[k][1],grid,vis);
        }
        return cnt;
    }
    // public static boolean chk(int i,int j,int grid[][]){
    //     if(j-1<0 || j+1>=grid[0].length){return false;}
    //     boolean vis[][]=new boolean[n][m];

    // }
    public int minDays(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        
        int cnt=0;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j] && cnt>0){return 0;}
                else if(grid[i][j]==1){
                    cnt+=comp(i,j,grid,vis);
                }
            }
        }

        if(cnt<2){return cnt;}
        
        int grd[][]={{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            
                if(grid[i][j]==1){
                    
                    int tot=comp(i,j,grid,new boolean[n][m]);
                    grid[i][j]=0;
                    int newi=-1,newj=-1;
                    for(int k=0;k<4;k++){
                        if(i+grd[k][0]>=0 && i+grd[k][0]<n && j+grd[k][1]>=0 && j+grd[k][1]<m && grid[i+grd[k][0]][j+grd[k][1]]==1){
                            newi=i+grd[k][0];
                            newj=j+grd[k][1];
                            break;
                        }
                    }
                    // System.out.print(tot);
                    if(tot-1!=comp(newi,newj,grid,new boolean[n][m])){return 1;}
                    grid[i][j]=1;
                }
            }
        }
        return 2;
    }
}