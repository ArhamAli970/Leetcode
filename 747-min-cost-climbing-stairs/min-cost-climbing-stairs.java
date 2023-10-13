class Solution { 

public static int min(int [] cost,int idx,int []dp){  
    // base case
    if(idx==cost.length-1 || idx==cost.length-2){ 
        return cost[idx];
    }
    if(dp[idx]!=Integer.MAX_VALUE){ 
        return dp[idx];
    }

    int oneStep=min(cost,idx+1,dp);
    int twoStep=min(cost,idx+2,dp);
    dp[idx]= Math.min(oneStep,twoStep)+cost[idx];
return dp[idx];
}
     
    public int minCostClimbingStairs(int[] cost) { 
        int dp[]= new int[cost.length];
        for(int i=0;i<dp.length;i++){ 
            dp[i]=Integer.MAX_VALUE;
        }
       int val=min(cost,0,dp); 

     int []   dp1= new int[cost.length];
        for(int i=0;i<dp1.length;i++){ 
            dp1[i]=Integer.MAX_VALUE;
        }
       int val2= min(cost,1,dp1); 

return Math.min(val,val2);
        
    }
}