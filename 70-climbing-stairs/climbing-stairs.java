class Solution {

public int fun(int stn,int[] dp){ 
if(stn==1 || stn==2){ 
    return stn;
}

if(dp[stn]!=0){ 
    return dp[stn];
}

 dp[stn]=fun(stn-1,dp)+fun(stn-2,dp);
return dp[stn];
}


    public int climbStairs(int n) { 


int stn=n; 
int dp[]= new int[n+1];
 return fun(stn,dp);

        
    }
}