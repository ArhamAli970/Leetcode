class Solution {
    static int dp[][];
    public static int call(int amount,int coins[],int i,int mon){ 
         if(amount==mon){return 1;}
         if(i>=coins.length || amount<mon){return 0;}

         if(dp[i][mon]!=-1){return dp[i][mon];}
         
         int tot=0;
    
        tot+= call(amount,coins,i,mon+coins[i])+ call(amount,coins,i+1,mon);
         

         dp[i][mon]=tot;

         return dp[i][mon];

    }
    public int change(int amount, int[] coins) {
        int n=coins.length;
        dp= new int[n][amount];

        for(int i[]:dp){Arrays.fill(i,-1);}

        return call(amount,coins,0,0);

        

    }
}