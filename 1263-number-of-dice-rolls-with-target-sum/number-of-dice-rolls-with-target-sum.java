class Solution {
    static long dp[][];
    static int mod;

    public static long call(int n, int k, int target,int i,int tot){ 
         
        if(tot>target ){return 0;}
        if(i>=n){ 
         return target==tot?1:0;
        }
        
        if(dp[i][tot]!=-1){return dp[i][tot];}
        
        long t=0;
        for(int j=1;j<=k;j++){ 
        
           t=(t+call(n,k,target,i+1,j+tot))%mod;
        
        }
        
        dp[i][tot]=t;
        return dp[i][tot];
      
        
        
    }
    
    public int numRollsToTarget(int n, int k, int target) {
        mod=1000000007;
            dp= new long[n+1][target+1];
        for(long i[]:dp){ 
        Arrays.fill(i,-1);
        }
        
    
        
        return (int)call(n,k,target,0,0)%mod;
        
        
    }
}