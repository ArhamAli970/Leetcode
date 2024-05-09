class Solution {
    static class node{
        int tRow,hRow,col;
        node(int tRow,int hRow,int col){
            this.tRow=tRow;
            this.hRow=hRow;
            this.col=col;
        }

    }
    public int minimumMoves(int[][] grid) {
        int n=grid.length;
        int [][][] dp= new int [n][n][2];

        
        
        Queue<node> q= new LinkedList<>();

        q.add(new node(0,0,1));
        dp[0][1][0]=1;
        int time=0;

        while(!q.isEmpty()){
            int size=q.size();
        for(int l=0;l<size;l++){
           node curr=q.remove();
           int r2=curr.tRow,r1=curr.hRow,col=curr.col;
        //    System.out.println(r1+" "+r2+" "+col);

           if(r1==n-1 && r2==n-1 && col==n-1 ){return time;}

           if(r1==r2){
             
                if( r1+1<n && col-1>=0 && grid[r1+1][col]==0 && grid[r1+1][col-1]==0){
                    if(dp[r1+1][col-1][0]==0) q.add(new node(r1,r1+1,col-1));
                     if(dp[r1+1][col][0]==0)  q.add(new node(r2+1,r1+1,col));
                    dp[r1+1][col-1][0]=1;
                    dp[r1+1][col][0]=1;
                }

                if(col+1<n && grid[r1][col+1]==0){
                if(dp[r1][col+1][0]==0)  q.add(new node(r2,r1,col+1));
                    dp[r1][col+1][0]=1;
                }

           }

           else{
                if(r1+1<n && grid[r1+1][col]==0){
                        if(dp[r1+1][col][1]==0)  q.add(new node(r1,r1+1,col));
                        dp[r1+1][col][1]=1;
                }

                if(col+1<n  && grid[r1][col+1]==0 && grid[r2][col+1]==0){
                    if(dp[r2][col+1][1]==0) q.add(new node(r2,r2,col+1));
                    if(dp[r1][col+1][1]==0) q.add(new node(r2,r1,col+1));
                    dp[r2][col+1][1]=1;
                    dp[r1][col+1][1]=1;
                }



           }

        }
        time++;

        }

        return -1;

        
    }
}