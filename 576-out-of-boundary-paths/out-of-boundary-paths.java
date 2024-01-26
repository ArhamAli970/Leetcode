class Solution {
    static long dp[][][];
    static int md=1000000007;
    public static long call(int r,int c,int move,int m,int n){
        if(r<0 || c<0 || r==m || c==n){return 1;}
        if(move<=0){return 0;}

        if(dp[r][c][move]!=-1){return dp[r][c][move];}

        long up=call(r-1,c,move-1,m,n);
        long down=call(r+1,c,move-1,m,n);
        long lft=call(r,c-1,move-1,m,n);
        long rht=call(r,c+1,move-1,m,n);

        dp[r][c][move]=(lft+down+up+rht)%md;
        return dp[r][c][move];

    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp= new long[51][51][51];  // row*col*51 (at particula (i,j) what is that move )

        for(int i=0;i<51;i++){
            for(int j=0;j<51;j++){
                for(int k=0;k<51;k++){
                    dp[i][j][k]=-1;
                }
            }
        }

        return (int)call(startRow,startColumn,maxMove,m,n);


    }
}