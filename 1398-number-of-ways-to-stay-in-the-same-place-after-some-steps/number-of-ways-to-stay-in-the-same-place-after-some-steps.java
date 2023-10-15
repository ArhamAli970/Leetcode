class Solution {
    static long dp[][];
    static int mod;
    public static long call(int i,int steps,int arrLen){ 
         if(steps==0 && i==0){return 1;}
        if(i>=arrLen || i<0 || steps==0 ){return 0;}
       

        if(dp[i][steps]!=-1){return dp[i][steps];}

        long rht=call(i+1,steps-1,arrLen);
        long lft=call(i-1,steps-1,arrLen);
        long stay=call(i,steps-1,arrLen);

        dp[i][steps]= (((rht+lft)%mod)+stay)%mod;

        return dp[i][steps];

    }


    public int numWays(int steps, int arrLen) {

            if(arrLen>=500){ 
                arrLen=500;
            }

             mod=1000000007;
            dp= new long[arrLen+1][steps+1];

            for(long i[]:dp){
            Arrays.fill(i,-1);
            }

            return (int)(call(0,steps,arrLen)%mod);

        
    }
}