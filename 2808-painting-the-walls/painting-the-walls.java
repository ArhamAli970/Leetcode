class Solution {
    static int dp[][]; 

public static int call(int cost[],int time[],int timeLeft,int idx){ 
           
           if(timeLeft<=0){return 0;}
           if(idx>=cost.length){return 1000000000;}

// System.out.print("df");
           if(dp[idx][timeLeft]!=-1){return dp[idx][timeLeft];}

           int lena=call(cost,time,timeLeft-time[idx]-1,idx+1)+cost[idx];
           int nhiLena=call(cost,time,timeLeft,idx+1);

           dp[idx][timeLeft]=Math.min(lena,nhiLena);

           return dp[idx][timeLeft];

}


    public int paintWalls(int[] cost, int[] time) {
        int n=time.length;
       dp=new int[n][n+1];
       for(int i[]:dp){
       Arrays.fill(i,-1);
       }
       return call(cost,time,cost.length,0);

    }
}