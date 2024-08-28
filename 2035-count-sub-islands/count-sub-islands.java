class Solution {
    static int n,m;
    static boolean isSub;
    static int dir[][]= {{-1,0},{0,1},{0,-1},{1,0}};;
    public static void call(int i,int j,int grid1[][],int grid2[][]){
        if(i==n || j==m || i<0 || j<0 || grid2[i][j]==0){return;}
        if(grid1[i][j]==0){isSub=false;}
        grid2[i][j]=0;
        
        for(int k=0;k<4;k++){
            int x=dir[k][0],y=dir[k][1];
            call(i+x,j+y,grid1,grid2);
        }

        return;

    }


    public int countSubIslands(int[][] grid1, int[][] grid2) {
        n=grid2.length;m=grid2[0].length;
        int cnt=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j]==1){
                    isSub=true;
                    call(i,j,grid1,grid2);
                    if(isSub){cnt++;}
                }

            }
        }

        return cnt;

    }
}