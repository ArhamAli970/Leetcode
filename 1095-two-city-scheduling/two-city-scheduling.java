class Solution {
    static int dp[][];
    static int n;
    public static int call(int i,int cnt,int costs[][]){
        if(i==costs.length){return cnt==n/2?0:100000000;}
        if(cnt>n/2){return 100000000;}

        if(dp[i][cnt]!=-1){return dp[i][cnt];}

        int take1=call(i+1,cnt+1,costs)+costs[i][0];
        int take2=call(i+1,cnt,costs)+costs[i][1];

dp[i][cnt]=Math.min(take1,take2);

        return dp[i][cnt];

    }
    public int twoCitySchedCost(int[][] costs) {
        n=costs.length;
        dp= new int[n][(n/2)+1];
        for(int i[]:dp){Arrays.fill(i,-1);}

        return call(0,0,costs);
    }
}