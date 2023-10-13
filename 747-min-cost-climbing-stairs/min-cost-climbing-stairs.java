class Solution { 

public static int min(int [] cost,int idx,int []dp){  
    // base case
    if(idx>=cost.length){ 
        return 0;
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
        
        Arrays.fill(dp,Integer.MAX_VALUE);

       min(cost,0,dp); 

    //    System.out.print(dp[0]+" "+dp[1]+" "+dp[2]);

       return Math.min(dp[0],dp[1]);

        
    }
}