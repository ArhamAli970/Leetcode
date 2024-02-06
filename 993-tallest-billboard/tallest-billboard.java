class Solution {
    static int dp[][];

    public static int call(int rods[],int i,int sum1){
        if(i>=rods.length){return sum1==0?0:-1000000;}

        if(dp[i][sum1+5000]!=-1){return dp[i][sum1+5000];}

        int take1=rods[i]+call(rods,i+1,sum1+rods[i]);
        int take2=call(rods,i+1,sum1-rods[i]);
        int notTake=call(rods,i+1,sum1);

        dp[i][sum1+5000]=Math.max(take1,Math.max(take2,notTake));
        return dp[i][sum1+5000];
        
    }


    public int tallestBillboard(int[] rods) {
        dp= new int[21][10001];

    
        for(int i[]:dp){ 
            Arrays.fill(i,-1);
        }


        return call(rods,0,0);

        

    }
}